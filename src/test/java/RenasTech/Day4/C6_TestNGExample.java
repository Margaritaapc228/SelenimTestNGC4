package RenasTech.Day4;

import org.testng.Assert;
import org.testng.annotations.*;

import java.lang.ref.SoftReference;

public class C6_TestNGExample {
    @BeforeClass
    public void setup1(){System.out.println("Before class is running");}
    @AfterClass
    public void setupAfterClass(){System.out.println("After class is running");}
    @BeforeMethod
    public void setup(){System.out.println("Before method is running");}
    @AfterMethod
    public void closing(){System.out.println("After Method is running");}

    @Test(priority = 3)
    public void TC1_1(){System.out.println("Test 1 is running");}
    @Test(priority = 1)
    public void TC3_3(){System.out.println("Test 3 is running");
    String actualWord = "New York";
    String expectWord = "Ohio";
        Assert.assertEquals(actualWord,expectWord);
    }
    @Test(priority = 2)
    public void TC2_2(){System.out.println("Test 2 is running");
    String name1 = "Alex";
    String name2 = "Alex";
            Assert.assertEquals(name1, name2);
    }

}
