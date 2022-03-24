package RenasTech.Day5;

import org.testng.Assert;
import org.testng.annotations.*;

public class C1_TestNG_example2 {
    @BeforeClass
    public void setup1(){System.out.println("Before class is running");}
    @AfterClass
    public void setupAfterClass(){System.out.println("After class is running");}
    @BeforeMethod
    public void setup(){System.out.println("Before method is running");}
    @AfterMethod
    public void closing(){System.out.println("After Method is running");}


    @Test(priority = 3, dependsOnMethods = "TC3_test3")
    public void TC1_test1(){System.out.println("Test1 is running");}

    @Test(priority = 1)
    public void TC3_test3(){
        System.out.println("Test3 is running");
        String actualWord="BMW";
        String expectedWord="Honda";
        Assert.assertEquals(actualWord,expectedWord);
        System.out.println("continue test 3");
    }

    @Test(priority = 2)
    public void TC2_test2(){
        System.out.println("Test2 is running");
        String str = "USA";
        String str2 = "USA";
        Assert.assertTrue(str.equals(str2));
    }

    @Ignore
    @Test
    public void TC4_test4(){System.out.println("Test4 is running");}
}
