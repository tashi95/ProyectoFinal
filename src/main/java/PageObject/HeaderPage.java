package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HeaderPage extends BasePage
{
    private By myaccountLink=By.linkText("My Account");
    private By registerLink=By.linkText("Register");


    public HeaderPage(String url,WebDriver driver)
    {
        super(url,driver);
    }

    public void clicMyaccountlink()
    {
        driver.findElement(this.myaccountLink).click();
    }
    public void clicRegisterlink()
    {
        driver.findElement(this.registerLink).click();
    }
    @Step
    public void goToregister()
    {

        this.clicMyaccountlink();
        this.clicRegisterlink();

    }

}
