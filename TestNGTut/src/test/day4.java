package test;

import org.testng.annotations.Test;

public class day4 {

	@Test
	public void WebloginCarLoan()
	{
		System.out.println("weblogincar");
	}
	
	@Test
	public void MobileLoginCarLoan()
	{
		System.out.println("mobilelogincar");
	}
	
	@Test(groups = {"Smoke"})
	public void LoginAPICarLoan()
	{
		System.out.println("APIlogincar");
	}
	
}
