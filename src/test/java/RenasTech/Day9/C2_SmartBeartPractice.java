package RenasTech.Day9;

import TestBase.TestBase;
import Utilities.PropertiesReadingUtil;
import Utilities.SmartBearUtils;
import org.testng.annotations.Test;

public class C2_SmartBeartPractice extends TestBase {

    @Test
    public void TC1_CharlesDeleteVerification(){
        driver.get(PropertiesReadingUtil.getProperties("SmartBear_url"));
        SmartBearUtils.logIngForSmartBear(driver);
    }
}
