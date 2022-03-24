package RenasTech.Day4;

import Utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class C1_ImplicitWait {
    public static void main(String[] args) {
        //1.open browser
       //2.go to the page https://www.vinexponewyork.com/
        // 3.click on attend button

        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.vinexponewyork.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("a[href='/attend/']")).click();

    }
}
