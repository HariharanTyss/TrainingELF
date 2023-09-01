package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frameworkUtility.BaseTest;

public class DWS_Register extends BaseTest 
{

	@DataProvider(name="TstData")
	public Object[][] testdata()
	{
		Object[][] data=new Object[1][5];
		
		data[0][0] ="Hariharan";
		data[0][1] ="M";
		data[0][2] ="harry1234@gmail.com";
		data[0][3] ="aaaaaa";
		data[0][4] ="aaaaaa";
		return data;
		
	}

	@Test(dataProvider = "TstData",priority = 1)
		public void  register(String fn,String ln,String mail,String pwd,String cpwd ) 
		{
			driver.findElement(By.partialLinkText("Register")).click();
			driver.findElement(By.id("FirstName")).sendKeys(fn);
			driver.findElement(By.id("LastName")).sendKeys(ln);
			driver.findElement(By.id("Email")).sendKeys(mail);
			driver.findElement(By.id("Password")).sendKeys(pwd);
			driver.findElement(By.id("ConfirmPassword")).sendKeys(cpwd);
			driver.quit();
			
	}
	

}
