package RenasTech.Day4;

import Utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class C3_Radio_button {
    //Navigate to https://courses.letskodeit.com/practice
    //click on BMW RADIO button
    //verify that its selected

    public static void main(String[] args) {

        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.get("https://courses.letskodeit.com/practice");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement BMWradiobutton = driver.findElement(By.xpath("//input[@id='bmwradio']"));
        BMWradiobutton.click();

        boolean bmwRadioSelected = BMWradiobutton.isSelected();
        if (bmwRadioSelected) {
            System.out.println("BMW is selected");
        }
        else {
            System.out.println("BMW is not selected, verification is failed");
        }
        WebElement Hondabutton = driver.findElement(By.id("Hondaradio"));
    }
}
