package testng.listners;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnersExample1.class)
public class Listners1 {

    @Test
    public void testA(){
        System.out.println("chrome is starting");
        Assert.assertTrue(true);
    }
    @Test
    public void testB(){
        System.out.println("search the engineering colleges");
        Assert.assertTrue(false);
    }
    @Test
    public void testC(){
        System.out.println("open the website");
        Assert.assertFalse(true);
    }
    @Test(dependsOnMethods = "testB")
    public void testD(){
        System.out.println("read the data");
    }
    @AfterTest
    public void reportClosed(){
        System.out.println("report closed");
    }
}
