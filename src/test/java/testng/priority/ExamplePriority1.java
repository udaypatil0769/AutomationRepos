package testng.priority;

import org.testng.annotations.Test;

public class ExamplePriority1 {
    @Test()
    public void methodV(){
        System.out.println("tet1");
    }
    @Test()
    public void methodW(){
        System.out.println("test2");
    }
}
