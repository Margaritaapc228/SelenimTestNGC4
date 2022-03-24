package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtil {

    //create a util that yakes browser type and create connection between browsers
    public static ChromeDriver getDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            //chrome browser needs to be set up
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            //set up for firefox
            WebDriverManager.firefoxdriver().setup();

        } else {
            System.out.println("Browser is not exist??");
            System.out.println("Check browser name");
            System.out.println("Browser=" + browser);
        }
        return null;
    }
}
