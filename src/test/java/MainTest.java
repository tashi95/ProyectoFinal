import PageObject.MainPage;
import com.techground.Main;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MainTest extends BaseTest
{


    @Test
    @Parameters({"product"})
    @Description("This method allows search a product")
    public void searchProduct(@Optional  String product) {
        MainPage mainPage= new MainPage(baseURL,driver);
        mainPage.insertproduct_insearchbar(product);
        mainPage.clicOnsearchbutton();
        mainPage.selectMacbookimg();
        mainPage.clicOnaddcartbutton();


       mainPage.waitUntilElementExists(mainPage.displaysuccessMessage());
        Assert.assertEquals(mainPage.displaysuccessMessage().isDisplayed(),true);

        mainPage.clicOnShoppingcart();
        mainPage.waitUntilElementExists(mainPage.displayfailMessage());
        Assert.assertEquals(mainPage.displayfailMessage().isDisplayed(), true);


    }
}
