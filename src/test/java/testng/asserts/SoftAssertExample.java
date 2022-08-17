package testng.asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    public static WebDriver driver;

    @BeforeMethod
    public void BeforeMethod(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver();
    }
    @Test
    public void Test2(){
        SoftAssert softAssert= new SoftAssert();
        driver.get("https://www.facebook.com");
        softAssert.assertEquals(driver.getTitle(), "Facebook – log in or sign up", "title should be Facebook - log in or sign up");
        softAssert.assertEquals(driver.findElement(By.id("email")).getText(), "", "title should be []");
        softAssert.assertEquals(driver.findElement(By.id("pass")).getText(), "", "title should be []");
        softAssert.assertAll();
    }
    @AfterMethod
    public void AfterMethod(){
        driver.close();
    }
}
