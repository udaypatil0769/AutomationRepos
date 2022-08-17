package testng.asserts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssert {
    public static WebDriver driver;

    @BeforeMethod
    public void BeforeMethod(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void Test1(){
        driver.get("https://www.Youtube.com");
        Assert.assertEquals(driver.getTitle(), "YouTube", "title shouble be YouTube");
        System.out.println("uday");
    }
    @AfterMethod
    public void AfterMethod(){
        driver.close();
    }
}
