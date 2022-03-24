package RenasTech.Day7;

import Utilities.SmartBearUtils;
import Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class C1_WecTable {
    //    Smartbear software street verification
//       1. Open browser and login to Smartbear software
//       2. Click on View all orders
//       3. Verify Mark Smith has street as  "9, Maple Valley"

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        SmartBearUtils.logIngForSmartBear(driver);
    }

    @Test
    public void TC1_VerifyMarkStreetName(){
        WebElement markStreet = driver.findElement(By.xpath("//td[.='770077007700']//..//td[6]"));
        System.out.println("Mark Street Name ="+ markStreet.getText());

        String actualStreet = markStreet.getText();
        String expected = "9, Maple Valley";

        Assert.assertEquals(actualStreet,expected, "streeet name verification has passed ");

    }
}
