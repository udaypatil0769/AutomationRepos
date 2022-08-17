package testng.listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersExample1 implements ITestListener {
    public void onTestStart(ITestResult result){
        System.out.println("Test is Start");
    }
    public void onTestSuccess(ITestResult result){
        System.out.println("Test is Successes");
    }
    public void onTestSkipped(ITestResult result){
        System.out.println("Test is Skipped");
    }
    public void onTestFailure(ITestResult result){
        System.out.println("Test is Fail");
    }
    public void onStart(ITestContext context){
        System.out.println("On Start");
    }
    public void onFininsh(ITestContext context){
        System.out.println("On Finish");
    }
}
