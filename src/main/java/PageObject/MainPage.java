package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage
{
    private By searchbar=By.name("search");
    private By searchbutton= By.xpath("//button[@class='btn btn-default btn-lg']");
    private By macbookimg= By.xpath("//img[@title='MacBook']");
    private By addcartbutton=By.id("button-cart");
    private By msgsuccess=By.xpath("//*[@id='product-product']/div[1]");
    private By msgfailed= By.xpath("//*[@id='checkout-cart']/div[1]");
    private By shoppingcartbutton=By.xpath("//li[4]/a");


    public MainPage(String url, WebDriver driver)
    {
        super(url,driver);
    }
    public WebElement setSearchbar()
    {
        return driver.findElement(this.searchbar);
    }
    public WebElement setSearchbutton()
    {
        return driver.findElement(this.searchbutton);
    }
    public WebElement setMacbookimage(){return driver.findElement(this.macbookimg);}
    public WebElement setAddcartbutton(){return driver.findElement(addcartbutton);}
    public WebElement setShoppingcartbutton(){return driver.findElement(shoppingcartbutton);}

    @Step
    public void insertproduct_insearchbar(String product)
    {
        setSearchbar().sendKeys(product);
    }
    @Step
    public void clicOnsearchbutton()
    {
        setSearchbutton().click();
    }
    @Step
    public void selectMacbookimg()
    {
        setMacbookimage().click();
    }
    @Step
    public void clicOnaddcartbutton()
    {
        setAddcartbutton().click();
    }
    @Step
    public void clicOnShoppingcart(){setShoppingcartbutton().click();}

    public WebElement displaysuccessMessage() {
        return driver.findElement(msgsuccess);
    }
    public WebElement displayfailMessage() {
        return driver.findElement(msgfailed);
    }
}
