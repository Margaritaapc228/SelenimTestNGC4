package RenasTech.Day4;

import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.testng.annotations.*;

public class C5_TestNGPractice {
    @BeforeClass
    public void setup1(){System.out.println("Before class is running");}
    @AfterClass
    public void setupAfterClass(){System.out.println("After class is running");}
    @BeforeMethod
    public void setup(){System.out.println("Before method is running");}
    @AfterMethod
    public void closing(){System.out.println("After Method is running");}

    @Test
    public void TC1(){System.out.println("Test1 is running");}
    @Test
    public void TC2(){System.out.println("Test2 is running");}
    @Test
    public void TC3(){System.out.println("Test3 is running");}
}
