package testng.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample1 {

    public static WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod
    public void BeforeMethod(String browserName){
        browserName.equals("chrome");
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();

        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
    }
    @Parameters({"videosName ", "videoQuality"})
    @Test
    public void verifyParameterization(String videosName,String videoQuality) {
        WebElement element= driver.findElement(By.id("search"));
        element.sendKeys(videosName+ " "+ videoQuality);
        element.sendKeys(Keys.ENTER);
    }
    @AfterMethod
    public void AfterMethod(){
        driver.close();
    }
}
