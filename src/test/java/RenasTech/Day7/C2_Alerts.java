package RenasTech.Day7;

import Utilities.BrowserUtils;
import Utilities.WebDriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class C2_Alerts {

    //1- Open a chrome browser
    //2- Go to:https://renas-practice.herokuapp.com/home
    //locate the alert button to click it
    //click button
    //handle alert

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver
                .manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://renas-practice.herokuapp.com/home");
    }
    @Test
    public void TC1_alertPractice() throws InterruptedException {
        driver.findElement(By.id("selenium-Elements")).click();
        driver.findElement(By.id("Alert BoxI")).click();

        WebElement AlertButton = driver.findElement(By.id("alert-demo"));
        AlertButton.click();

        Alert alert = driver.switchTo().alert();
        BrowserUtils.wait(3);
        alert.accept();
    }
}
