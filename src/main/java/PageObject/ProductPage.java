package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage
{
    public ProductPage(String url, WebDriver driver)
    {
        super(url,driver);
    }

    private By productMacbook= By.xpath("//div[@class='image']/a");
    private By productIphone=By.xpath("//a[@href='https://demo.opencart.com/index.php?route=product/product&product_id=40']");
    private By currencyLink=By.xpath("//button[@class='btn btn-link dropdown-toggle']");
    private By euroLink= By.xpath("//button[@name='EUR']");
    private By poundLink= By.xpath("//button[@name='GBP']");
    private By dollarLink= By.xpath("//button[@name='USD']");

    private By productName= By.xpath("//*[@class='col-sm-4']/h1");
            // div[@class='col-sm-4']/h1");
    private By price=By.xpath("//ul[@class='list-unstyled']/li/h2");




    public WebElement setProductMacbook() {
        return driver.findElement(this.productMacbook);
    }
    public WebElement setProductIphone()
    {
        return driver.findElement(this.productIphone);
    }
    public WebElement setProductName()
    {
        return driver.findElement(this.productName);
    }
    public WebElement setPrice()
    {
        return driver.findElement(this.price);
    }
    public void clicCurrencylink()
    {
        driver.findElement(this.currencyLink).click();
    }
    public void clicEurolink(){driver.findElement(this.euroLink).click();}
    public void clicPoundlink(){driver.findElement(this.poundLink).click();}
    public void clicDollarlink(){driver.findElement(this.dollarLink).click();}

    @Step
    public void goToEuro()
    {
        clicCurrencylink();
        clicEurolink();
    }
    @Step
    public void goToPound()
    {
        clicCurrencylink();
        clicPoundlink();
    }
    @Step
    public void goTodollar()
    {
        clicCurrencylink();
        clicDollarlink();
    }

    @Step
    public void clicOnproductMacbook()
    {
        setProductMacbook().click();
    }
    @Step
    public void clicOnproductIphone()
    {
        setProductIphone().click();
    }
    @Step
    public String ViewProductName()
    {
        return setProductName().getText();
    }
    @Step
    public String ViewProductPrice()
    {
        return setPrice().getText();
    }
}
