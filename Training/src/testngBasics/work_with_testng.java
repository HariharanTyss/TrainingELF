package testngBasics;

import org.testng.annotations.Test;

public class work_with_testng 
{
	@Test(groups = "smoke")
	public void Register()
	{
		System.out.println("Register Sucessful");
	}
	@Test(groups = "smoke")
	public void Login()
	{
		System.out.println("Login Sucessful");
	}
	@Test
	public void Search()
	{
		System.out.println("Search Sucessful");
	}
	@Test
	public void Subscribe()
	{
		System.out.println("Subscribe Sucessful");
	}
	@Test(groups = "smoke")
	public void Logout()
	{
		System.out.println("Logout Sucessful");
	}

}
