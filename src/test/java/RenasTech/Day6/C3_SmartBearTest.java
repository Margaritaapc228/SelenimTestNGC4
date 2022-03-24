package RenasTech.Day6;

import Utilities.SmartBearUtils;
import Utilities.WebDriverUtil;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class C3_SmartBearTest {
    //1- Open a chrome browser
//2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//3- Login
//4. Click on Order
//5. Select familyAlbum from product, set quantity to 5
//6. Click to "Calculate" button
//7. Fill address Info with JavaFaker
//8. Click on "visa" radio button
//9. Generate card number using JavaFaker
//10Enter expiration date
//11. Click on "Process"
//12.Verify success message "New order has been successfully

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        //1- Open a chrome browser
//2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //3- Login
        SmartBearUtils.logIngForSmartBear(driver);
    }
    @Test
    public void TC1(){
        WebElement orderLink=driver.findElement(By.xpath("//a[.='Order']"));
        orderLink.click();
        Select dropDownProduct = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        dropDownProduct.selectByVisibleText("FamilyAlbum");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement quantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.sendKeys(Keys.BACK_SPACE);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        quantity.sendKeys("5");

        WebElement CalculateButton = driver.findElement(By.xpath("//input[@value='Calculate']"));
        CalculateButton.click();

        Faker faker = new Faker();
        WebElement customerName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement streetName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement city = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement state = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        WebElement zip = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
        customerName.sendKeys(faker.name().fullName());
        streetName.sendKeys(faker.address().streetAddress());
        city.sendKeys(faker.address().city());
        state.sendKeys(faker.address().state());
        zip.sendKeys(faker.address().zipCode().replace("-", ""));

        WebElement Visa = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        Visa.click();
        WebElement CardNumber = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        CardNumber.sendKeys(faker.finance().creditCard().replaceAll("-",""));
        WebElement exp = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        exp.sendKeys("02/24");

        WebElement processButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        processButton.click();

        WebElement SuccessMessage = driver.findElement(By.xpath("//strong"));
        Assert.assertEquals(SuccessMessage.getText(),"New order has been successfully added.");




    }
}
