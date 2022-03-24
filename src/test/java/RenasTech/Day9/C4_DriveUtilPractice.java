package RenasTech.Day9;

import TestBase.TestBase2;
import Utilities.DriveUtil;
import Utilities.PropertiesReadingUtil;
import org.testng.annotations.Test;

public class C4_DriveUtilPractice extends TestBase2 {
    @Test
    public void TC1_practice(){
        DriveUtil.getDriver().get(PropertiesReadingUtil.getProperties("google url"));
    }

}
