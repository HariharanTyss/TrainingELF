package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frameworkUtility.BaseTest;

public class DWS_subscribe extends BaseTest 
{
	@DataProvider(name="TstData")
	public Object[][] testdata()
	{
		Object[][] data=new Object[1][2];
		
		
		data[0][0] ="harry1234@gmail.com";
		data[0][1]="123";
		return data;
		
	}
	@Test(dataProvider = "TstData")
	public void search(String mail,String nm) 
	
	{
		//To find the Subscribe Text Field and give input
		driver.findElement(By.id("newsletter-email")).sendKeys("search");
		
		//click on Subscribe Button
		driver.findElement(By.xpath("//input[@value='Subscribe']")).click();
	}

}
