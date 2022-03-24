package RenasTech.Day5;

import Utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class C3_Dropdown {

    WebDriver driver;

    @BeforeClass
    public void beforeClass(){System.out.println("Before class is running");}
    @AfterClass
    public void AfterClass(){System.out.println("After class is running");}
    @BeforeMethod
    public void setUp(){
        driver = WebDriverUtil.getDriver("chrome");
    }

}
