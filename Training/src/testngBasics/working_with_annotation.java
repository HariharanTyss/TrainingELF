package testngBasics;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class working_with_annotation 
{
	@Test(priority = 0,invocationCount = 2,dependsOnMethods = "car")
	public void Demo() 
	{
		Reporter.log("Demoo",true);
		System.out.println("Demo Sucessfully");
	}

	@BeforeMethod
	public void BeforeMethod() 
	{
		System.out.println("BeforeMethod Sucessfully");
	}

	@AfterMethod
	public void AfterMethod() 
	{
		System.out.println("AfterMethod Sucessfully");
	}
	
	@BeforeTest
	public void Beforetest() 
	{
		System.out.println("Beforetest Sucessfully");
	}
	@AfterTest
	public void Aftertest() 
	{
		System.out.println("Aftertest Sucessfully");
	}
	@BeforeClass
	public void Beforeclass() 
	{
		System.out.println("Beforeclass Sucessfully");
	}
	
	@AfterClass
	public void AfterClass() 
	{
		System.out.println("AfterClass Sucessfully");
	}
	
	@Test(priority =1)
	   void car() 
	{
		System.out.println("Car ");
		Reporter.log("carr",true);
	}
	
	

}
