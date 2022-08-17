package testng.reportgeneretor;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testng.listners.ListnersExample1;

@Listeners(ListnersExample1.class)
public class ExtentReportGeneretor {

    public static WebDriver driver;
    ExtentReports reports = new ExtentReports();
    ExtentSparkReporter sparkReporter = new ExtentSparkReporter("Eveningbatch.html");
    ExtentTest test;

    @BeforeTest
    public void beforeTest(){
        reports.attachReporter(sparkReporter);
    }
    @Test
    public void test1(){
        test= reports.createTest("Launch the browser").assignAuthor("uday").assignDevice("chrome");
        test.info("User is opening the browser");
        System.out.println("test1");
        Assert.assertTrue(true);
        test.pass("This test is pass");
    }
    @Test
    public void test2(){
        test= reports.createTest("Launch the browser").assignAuthor("prathamesh").assignDevice("chrome");
        test.info("User is opening the browser");
        System.out.println("test2");
        test.fail("This test is pass");
        Assert.assertFalse(true);
    }
    @Test
    public void test3(){
        test = reports.createTest("Launch the browser").assignAuthor("shivprasad").assignDevice("chrome");
        test.info("User is opening the browser");
        System.out.println("test3");
        test.fail("This test is pass");
        Assert.assertTrue(false);
    }
    @Test
    public void test4(){
        test = reports.createTest("Launch the browser").assignAuthor("satish").assignDevice("chrome");
        test.info("User is opening the browser");
        System.out.println("test4");
        test.fail("This test is pass");
        Assert.assertTrue(true);
    }
    @AfterTest
    public void reportngClose(){
        reports.flush();
    }
}
