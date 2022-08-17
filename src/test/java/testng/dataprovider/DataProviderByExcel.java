package testng.dataprovider;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.Key;

public class DataProviderByExcel {
    public static WebDriver driver;

    @DataProvider(name= "test-data")
    public  Object[][] dataProviderFun()throws IOException{
        Object[][] arrobj= getExcelSheetData("C:\\digital IT\\New folder\\TestData.xlsx","test1-data");
        return arrobj;

    }
    public String[][] getExcelSheetData(String fileName, String sheetName)throws IOException{
        String[][] data= null;
        FileInputStream fileInputStream= new FileInputStream(fileName);
        XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);
        XSSFSheet sh = wb.getSheet(sheetName);
        XSSFRow row = sh.getRow(0);
        int noOfRows = sh.getPhysicalNumberOfRows();
        int noOfColumns = row.getLastCellNum();
        Cell cell;
        data = new String[noOfRows-1][noOfColumns];
        for(int i = 1; i < noOfRows; i++){
            for(int j = 0; j < noOfColumns; j++){
                row = sh.getRow(i);
                cell = row.getCell(j);
                data[i-1][j] = cell.getStringCellValue();
            }
        }
        return data;
    }
    @Parameters({"browerName"})
    @BeforeMethod
    public void beforeMethod(String browerName){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.amazon.in");

        driver.manage().window().maximize();
    }
    @Test(dataProvider = "test-data")
    public void verifyParameter(String name, String model){
        WebElement element = driver.findElement(By.name("field-keywords"));
        element.sendKeys(name+" "+model);
        element.sendKeys(Keys.ENTER);
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
