package testng.annotaion;


import org.testng.annotations.*;

public class AnnotaionExample {
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("uday");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("shivprasad");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("prathamesh");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("satish");
    }
    @Test
    public void Example1(){
        System.out.println("kamram");
    }
    @Test
    public void Example(){
        System.out.println("vitthal");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("chetan");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("abhay");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("vijay");
    }
    @AfterSuite
    public void AfterSuit(){
        System.out.println("vishal");
    }


}
