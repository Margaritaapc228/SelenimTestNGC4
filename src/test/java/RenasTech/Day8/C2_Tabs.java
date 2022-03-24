package RenasTech.Day8;

import TestBase.TestBase;
import Utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class C2_Tabs extends TestBase {
    //WE USE INHERITANCE HERE

    @Test
    public void TC1_TabHandle() throws InterruptedException {
        //click on elements
        driver.get("https://renas-practice.herokuapp.com/home");
        driver.findElement(By.id("selenium-Elements")).click();
        driver.findElement(By.id("WindowsII")).click();

        String currentWindow = driver.getWindowHandle();//this will store only one window

        System.out.println("current window:" + currentWindow);
        System.out.println("get Title:" + driver.getTitle());

        WebElement openTabButton = driver.findElement(By.id("open-tab"));
        openTabButton.click();
        System.out.println("after clicking tab button title:"+ driver.getTitle());

        Set<String>allwindow = driver.getWindowHandles();//this will store all tabs/windows
        for (String tab:allwindow){
            driver.switchTo().window(tab);
            BrowserUtils.wait(2);
            System.out.println(driver.getTitle());

        }
    }
}