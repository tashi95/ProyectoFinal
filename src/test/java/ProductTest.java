import DataProviders.NewUsersProvider;
import DataProviders.ProductsProvider;
import PageObject.ProductPage;
import io.qameta.allure.Description;
import okio.Timeout;
import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojo.ProductData;

import java.util.concurrent.TimeUnit;

public class ProductTest extends BaseTest
{
    @Test (dataProvider = "getProductsDataFromJson", dataProviderClass = ProductsProvider.class)
    @Description("this method allows compare product price")
    public void currency(ProductData productData)
    {
        ProductPage product= new ProductPage(baseURL,driver);

        if (productData.getProduct().equals("MacBook"))
        {
            product.clicOnproductMacbook();
            product.goToEuro();
            Assert.assertEquals(product.setPrice().isDisplayed(), true);
            Assert.assertEquals(productData.getEuro(),product.ViewProductPrice());
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            product.goToPound();
            Assert.assertEquals(product.setPrice().isDisplayed(), true);
            Assert.assertEquals(productData.getPoundSterlin(),product.ViewProductPrice());
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            product.goTodollar();
            Assert.assertEquals(product.setPrice().isDisplayed(), true);
            Assert.assertEquals(productData.getDollar(),product.ViewProductPrice());
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        }
        else
        {
          product.clicOnproductIphone();

            product.goToEuro();
            Assert.assertEquals(product.setPrice().isDisplayed(), true);
            Assert.assertEquals(productData.getEuro(),product.ViewProductPrice());
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            product.goToPound();
            Assert.assertEquals(product.setPrice().isDisplayed(), true);
            Assert.assertEquals(productData.getPoundSterlin(),product.ViewProductPrice());
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

            product.goTodollar();
            Assert.assertEquals(product.setPrice().isDisplayed(), true);
            Assert.assertEquals(productData.getDollar(),product.ViewProductPrice());
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }

        Assert.assertEquals(productData.getProduct(),product.ViewProductName());


    }

}
