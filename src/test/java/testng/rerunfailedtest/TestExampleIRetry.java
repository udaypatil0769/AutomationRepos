package testng.rerunfailedtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestExampleIRetry {

    @Test(retryAnalyzer = TestIRetryAnalyzer.class )
    public void testA(){
        System.out.println("uday");
        Assert.assertTrue(true);
    }
    @Test(retryAnalyzer = TestIRetryAnalyzer.class)
    public void testB(){
        System.out.println("prathamesh");
        Assert.assertFalse(false);
    }
    @Test(retryAnalyzer = TestIRetryAnalyzer.class)
    public void testC(){
        System.out.println("shivprasad");
        Assert.assertTrue(false);
    }
    @Test(retryAnalyzer = TestIRetryAnalyzer.class)
    public void testD(){
        System.out.println("satish");
        Assert.assertFalse(true);
    }
    @Test(retryAnalyzer = TestIRetryAnalyzer.class)
    public void testE(){
        System.out.println("abhay");
        Assert.assertTrue(true);
    }
}
