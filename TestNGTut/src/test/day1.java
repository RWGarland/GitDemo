package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class day1 {

	@Test
	public void Demo() 
	{
		System.out.println("Demo test 1");//automation test scripts
		
	}
	
	@AfterSuite
	public void afSuite()
	{
		System.out.println("I am the the last comment");
	}
	@Test
	public void SecondDemo() 
	{
		System.out.print("Second demo test");
	
	}

}
