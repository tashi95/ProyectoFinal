package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.qameta.allure.Step;

import java.util.Random;

public class RegisterPage extends BasePage
{
    private By firstNameTextBox= By.id("input-firstname");
    private By lastNameTextBox= By.id("input-lastname");
    private By emailTextBox= By.id("input-email");
    private By telephoneTextBox= By.id("input-telephone");
    private By passwordTextBox= By.id("input-password");
    private By confirmPassTextBox= By.id("input-confirm");
    private By suscribeRadio= By.xpath("//*[@name='newsletter'][@value='0']");
    private By privacyPolicyCheckbox= By.xpath("//input[@type='checkbox'][@value='1']");
    private By continueButton= By.xpath("//input[@type='submit']");

    private By continuebuttonacount= By.xpath("//div[@class='pull-right']/a");
    private By dashboard = By.id("account-account");


    public RegisterPage(String url, WebDriver driver) {
        super(url,driver);
    }

    public WebElement setFirstNameTextbox()
    {
        return driver.findElement(this.firstNameTextBox);
    }
    public WebElement setLastNameTextbox()
    {
        return driver.findElement(this.lastNameTextBox);
    }
    public WebElement setEmailTextbox() { return driver.findElement(this.emailTextBox); }
    public WebElement setTelephoneTextbox()
    {
        return driver.findElement(this.telephoneTextBox);
    }
    public WebElement setPasswordTextbox()
    {
        return driver.findElement(this.passwordTextBox);
    }
    public WebElement setConfirmPasswordTextbox()
    {
        return driver.findElement(this.confirmPassTextBox);
    }
    public WebElement setSuscribeRadio()
    {
        return driver.findElement(this.suscribeRadio);
    }
    public WebElement setPrivacyPolicyCheckbox()
    {
        return driver.findElement(this.privacyPolicyCheckbox);
    }
    public WebElement setContinueButton()
    {
        return driver.findElement(this.continueButton);
    }
    public WebElement setContinueButtonAccount()
    {
        return driver.findElement(this.continuebuttonacount);
    }

    @Step
    public void insertFirstname(String _firstname)
    {
        setFirstNameTextbox().sendKeys(_firstname);
    }
    @Step
    public void insertLastname(String _lastname)
    {
        setLastNameTextbox().sendKeys(_lastname);
    }
    @Step
    public void insertEmail(String _email) { setEmailTextbox().sendKeys(_email); }
    @Step
    public void insertTelephone(String _Telephone)
    {
        setTelephoneTextbox().sendKeys(_Telephone);
    }
    @Step
    public void insertPassword(String _Password)
    {
        setPasswordTextbox().sendKeys(_Password);
    }
    @Step
    public void insertConfirmPassword(String _ConfirmPass) { setConfirmPasswordTextbox().sendKeys(_ConfirmPass);}
    @Step
    public void chooseSuscribeRadio()
    {
        setSuscribeRadio().click();
    }
    @Step
    public void acceptPrivacypolicy()
    {
        setPrivacyPolicyCheckbox().click();
    }
    @Step
    public void clicOncontinueButton()
    {
        setContinueButton().click();
    }
    @Step
    public void clicOncontinuiButtonAccount()
    {
        setContinueButtonAccount().click();
    }
    public WebElement assertregisterpage() { return driver.findElement(By.xpath("//ul[@class='breadcrumb']")); }
    public WebElement showDashboard() {
        return driver.findElement(this.dashboard);
    }

}
