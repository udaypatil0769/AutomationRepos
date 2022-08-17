package testng.priority;

import org.testng.annotations.Test;

public class SetPriority {
    @Test(priority = -1)
    public void methodB(){
        System.out.println("uday");
    }
    @Test()
    public void methodA(){
        System.out.println("shiv");
    }
    @Test(priority = 1)
    public void methodC(){
        System.out.println(
                "prathamesh");
    }
    @Test(priority = -2)
    public void methodD(){
        System.out.println("satish");
    }
}
