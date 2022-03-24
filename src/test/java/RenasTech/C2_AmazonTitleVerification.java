package RenasTech;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2_AmazonTitleVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //go to google
        driver.get("https://www.google.com");
        //navigate back
        driver.navigate().back();
        //navigate forward
        driver.navigate().forward();
        //navigate to https://www.amazon.com
        driver.navigate().to("https://www.amazon.com");

        //verify tittle contains: Smile

        String contansTitle = "Smile";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(contansTitle)) {
            System.out.println("Amazon Title verification has passed");
        }
        else {
            System.out.println("Amazon Title verification has failed");
        }
    }
}