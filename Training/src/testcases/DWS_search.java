package testcases;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frameworkUtility.BaseTest;

public class DWS_search extends BaseTest 
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
		//To find the SerachBox textfield and give input
		driver.findElement(By.id("small-searchterms")).sendKeys(mail);
		
		//To click on Search Button
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
	}


}
