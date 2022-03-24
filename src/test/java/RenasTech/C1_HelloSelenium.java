package RenasTech;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.bind.annotation.W3CDomHandler;

public class C1_HelloSelenium {
    public static void main(String[] args) {

        //create connection betwen selenium and browser
        //setup browser
        WebDriverManager.chromedriver().setup();

        //create an instance of chromedriver to be able to test with chrome
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.getCurrentUrl();
        System.out.println("Current Url is:" + driver.getCurrentUrl());



    }
}
