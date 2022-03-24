package RenasTech.Day7;

import Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class C3_iFrames {
        //1- Open a chrome browser
//2- Go to:http://the-internet.herokuapp.com/iframe
//3- Switching by id or name attribute value.
        WebDriver driver;
        @BeforeMethod
        public void setup(){
                driver = WebDriverUtil.getDriver("chrome");
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.get("http://the-internet.herokuapp.com/iframe");
        }
        @Test
        public void TC1_iframe(){
                driver.switchTo().frame("mce_0_ifr");

                WebElement MessageBox = driver.findElement(By.id("tinymce"));
                MessageBox.clear();
                MessageBox.sendKeys("This is best Renastech class ever");

                driver.switchTo().defaultContent();
                driver.switchTo().parentFrame();
        }
}
