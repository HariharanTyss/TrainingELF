package testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frameworkUtility.BaseTest;
import testngBasics.HandlingExcel;
public class DWS_login extends BaseTest
{
	@DataProvider(name="TstData")
	public void logintestData() throws EncryptedDocumentException, IOException
	{
		HandlingExcel.readmultiple("login");
	}
	@Test(dataProvider = "TstData")
	public void search(String mail,String pwd) 
	{
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(mail);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	/*
	 
	public Object[][] testdata()
	{
		Object[][] data=new Object[1][2];
		
		
		data[0][0] ="harry1234@gmail.com";
		data[0][1]="aaaaaa";
		return data;
	}
	*/

}
