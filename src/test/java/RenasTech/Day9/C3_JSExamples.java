package RenasTech.Day9;

import TestBase.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Optional;
import java.util.Set;

public class C3_JSExamples extends TestBase {
    @Test
    public void TC1_handling_Window_with_js_Executer(){
        driver.get("https://www.youtube.com");
        ((JavascriptExecutor)driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor)driver).executeScript("window.open('https://facebook.com','_blank');");

        Set<String> windows = driver.getWindowHandles();

        for (String window : windows){
            driver.switchTo().window(window);
            String currentWindow = driver.getWindowHandle();
            System.out.println("current window="+currentWindow);
            System.out.println("title="+ driver.getTitle());

        }
    }
    @Test
    public void scrollDownJ(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("ttp://demo.guru99.com/test/guru99home/");
        js.executeScript("window.scrollBy(0,1000");

          /*
The syntax of ScrollBy() methods is :

executeScript("window.scrollBy(x-pixels,y-pixels)");
x-pixels is the number at x-axis,
it moves to the left if number is positive and
it move to the right if number is negative .
y-pixels is the number at y-axis,
it moves to the down if number is positive and
it move to the up if number is in negative .
 */
    }
}

