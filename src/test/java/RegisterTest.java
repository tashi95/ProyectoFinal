import DataProviders.NewUsersProvider;
import PageObject.HeaderPage;
import PageObject.RegisterPage;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.RegisterData;

import java.util.Random;


public class RegisterTest extends BaseTest
{

    @Test(dataProvider = "getnewUsersDataFromJson", dataProviderClass = NewUsersProvider.class)
    @Description("this method allows register new user")
    public void register_NewUser(RegisterData _registerData)  throws InterruptedException  {
        RegisterPage register = new RegisterPage(baseURL,driver);
        HeaderPage header= new HeaderPage(baseURL, driver);
        header.goToregister();

        register.insertFirstname(_registerData.getFirstname());
        register.insertLastname(_registerData.getLastname());
        register.insertEmail(getRandomEmail()+"@gmail.com");
        register.insertTelephone(_registerData.getTelephone());
        register.insertPassword(_registerData.getPassword());
        register.insertConfirmPassword(_registerData.getConfirmpass());
        register.chooseSuscribeRadio();
        register.acceptPrivacypolicy();
        register.clicOncontinueButton();
        register.clicOncontinuiButtonAccount();


        register.waitUntilElementExists(register.assertregisterpage());
        Assert.assertEquals(register.showDashboard().isDisplayed(), true);

    }
    public String getRandomEmail()
    {
        String charts = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt= new StringBuilder();
        Random rmd= new Random();

        while(salt.length()<12)
        {
            int index = (int)(rmd.nextFloat()* charts.length());
            salt.append(charts.charAt(index));
        }
        String saltStr= salt.toString();
        return saltStr;
    }



}
