package testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testngBasics.HandlingExcel;



public class loginTest 
{


	@DataProvider(name="lgn_TstData")
	public String[][] logintestData() throws EncryptedDocumentException, IOException
	{
		return HandlingExcel.readmultiple("login");

	}
	@Test(dataProvider = "lgn_TstData")
	public void search(String mail,String pwd) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(mail);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		//driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.close();
	}
	
}
