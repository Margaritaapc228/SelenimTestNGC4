package TestBase;

import Utilities.BrowserUtils;
import Utilities.DriveUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase2 {
    //abstaction example

    @BeforeMethod
    public void setUp(){
        DriveUtil.getDriver().manage().window().maximize();
        DriveUtil.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void closing() throws InterruptedException{
        BrowserUtils.wait(3);
       // DriveUtil.closeDriver();
    }
}
