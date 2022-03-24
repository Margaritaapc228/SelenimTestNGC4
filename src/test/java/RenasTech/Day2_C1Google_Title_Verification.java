package RenasTech;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_C1Google_Title_Verification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();
    }

    public static class GoogleNameLocator {
        //TASK: Google search
    //1- Open a chrome browser
    //2- Go to: https://google.com
    //3- Write "orange" in search box
    //4- Click google search button
    //5- Verify title:
    //Expected: Title should start with "orange" word
    //6-navigate back
    //7-write banana in search box
    //8-verify title contains banana.
        public static void main(String[] args) throws InterruptedException {
            //1- Open a chrome browser
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            //2- Go to: https://google.com
            driver.get("https://www.google.com");
            driver.manage().window().maximize();
            //3- Write "orange" in search box
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox .sendKeys("orange");
            Thread.sleep (2000) ;
            //4- Click google search button
            driver.findElement(By.name("btnK")).click();
            //5- Verify title:
            // Expected: Title should start with "orange" word
            String expectedTitle = "orange";
            String actualTitle = driver.getTitle();
            if (actualTitle.startsWith(expectedTitle)) {
                System.out.println("Title verification has passed");
            }
            else {
                System.out.println("Title verification has failed");
                System.out.println("actualTitle="+actualTitle);
            }
            //6-navigate back
            Thread.sleep (2000) ;
            driver.navigate().back();
            //7-write banana in search box
            WebElement searchBox1= driver.findElement(By.name("q"));
            searchBox1.sendKeys("banana");

        }
    }
}
