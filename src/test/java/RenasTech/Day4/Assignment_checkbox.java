package RenasTech.Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_checkbox {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//2. Go to https://demo.guru99.com/test/radio.html
        driver.get("https://demo.guru99.com/test/radio.html");
//3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
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
//4. Click to checkbox3
//5. Verify checkbox3 is selected


}
