package RenasTech;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2_BrowserNavigation {
    public static void main (String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    // driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().fullscreen();
        driver.get("https://www.apple.com/");
        driver.get("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();
        //it will close the tabs
        // driver.close();
        driver.quit();
    }
}
