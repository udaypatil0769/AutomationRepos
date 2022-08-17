package testng.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
    public static WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod
    public void beforeMethod(String browserName) {
        browserName.equals("chrome");
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();

        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
    }
    @Parameters({"name","model"})
    @Test
    public void verifyParameter(String name,String model){
        WebElement element=driver.findElement(By.name("field-keywords"));
        element.sendKeys(name+" " +model);
        element.sendKeys(Keys.ENTER);
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
