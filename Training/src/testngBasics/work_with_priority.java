package testngBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class work_with_priority 
{
	
	@Test(dependsOnMethods = "E",priority = 0)
	public void A()
	{
		System.out.println("A Sucessful");
	}
	
	@Test(priority = 2)
	public void B()
	{
		System.out.println("B Sucessful");
	}
	@Test(priority = 4)
	public void C()
	{
		System.out.println("C Sucessful");
	}
	@Test(priority = 3)
	public void D()
	{
		System.out.println("D Sucessful");
	}

	@Test(priority = 5,invocationCount = 3,threadPoolSize = 2)
	public void E()
	{
		System.out.println(" E Sucessful");
	}


}
