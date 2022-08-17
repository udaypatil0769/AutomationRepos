package testng.rerunfailedtest;

import org.testng.IRetryAnalyzer;

public class TestIRetryAnalyzer implements IRetryAnalyzer {

    private int retryCount = 0;
    private int maxRetryCount = 4;

    public  boolean retry(org.testng.ITestResult iTestResult){
        if( retryCount < maxRetryCount){
            retryCount++;
            return true;
        }
        return false;
    }
}
