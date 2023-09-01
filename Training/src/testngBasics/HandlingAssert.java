package testngBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HandlingAssert 
{
	@Test(invocationCount = 0)
	public void HandleHardAssert() 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shopp");
		
		
		driver.findElement(By.partialLinkText("Register")).click();
		System.out.println("Hard Assert Done");
		driver.quit();
	}
	
	@Test(invocationCount = 1)
	public void HandleSoftAssert() 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		SoftAssert ast=new SoftAssert();
		
		ast.assertEquals(driver.getTitle(), "Facebook","Title Verfification");
		driver.findElement(By.partialLinkText("Register")).click();
		System.out.println("Soft assert Done");
		driver.findElement(By.id("small-searchterms")).sendKeys("computer");
		
		driver.quit();
		ast.assertAll();
	}
	

	
}
