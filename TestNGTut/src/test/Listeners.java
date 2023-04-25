package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener 
{
	
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("This has been successfull for listeners");
	}
	
	
}
