package testng.invocationcount;

import org.testng.annotations.Test;

public class InvocationCount {
    @Test()
    public void methodA(){
        System.out.println("uday");
    }
    @Test(priority = -1, invocationCount = 20, invocationTimeOut = 500)
    public void methodC(){
        System.out.println("shiv");
    }
    @Test(invocationCount = 40, invocationTimeOut = 1000)
    public void methodB(){
        System.out.println("prathmesh");
    }
}
