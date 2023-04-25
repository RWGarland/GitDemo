package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void beforeclass() 
	{
		System.out.println("Before the class is shown");
	}

	@Test(dataProvider="getData")
	public void WebloginHomeLoan(String username, String password)
	{
		System.out.println("webloginHome");
		System.out.println(username);
		System.out.println(password);
	}
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("Before executing all the methods in a class");
	}
	
	@AfterMethod
	public void afterclass() 
	{
		System.out.println("After executing all the methods in a class");
	}
	
	@Test(dependsOnMethods = {"WebloginHomeLoan","WebloginHomeLoan"})
	public void MobileLoginHomeLoan()
	{
		System.out.println("mobileloginhome");
	}
	
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am number one");
	}
	
	@Test(groups = {"Smoke"})
	public void LoginAPIHomeLoan()
	{
		System.out.println("APIloginhome");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0]="firstsetusername";
		data[0][1]="password";
		
		data[1][0]="Secondsetusername";
		data[1][1]="secondpassword";
		
		data[2][0]="Thirdsetusername";
		data[2][1]="Thirdpassword";
		return data;
	}
	
}
