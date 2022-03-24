package RenasTech.Day4;

import Utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class C2_Checkbox {
    //1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html
//3. Verify checkbox1 is not selected
//4. Click to checkbox2
//5. Verify checkbox2 is selected
    public static void main(String[] args) {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/radio.html");
        WebElement checkBox1 = driver.findElement(By.id("vfb-6-0"));
        if (!checkBox1.isSelected()){
            System.out.println("Checkbox1 verification has pased");
            }
        else {
            System.out.println("Checkbox1 verification has failed");
        }

        WebElement checkbox2 = driver.findElement(By.id("vfb-6-1"));
        checkbox2.click();

        if (checkbox2.isSelected()){
            System.out.println("Checkbox2 verification has pased");
        }
        else {
            System.out.println("Checkbox2 verification has failed");
        }
    }
}
