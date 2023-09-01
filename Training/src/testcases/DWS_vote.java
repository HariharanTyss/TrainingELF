package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import frameworkUtility.BaseTest;

public class DWS_vote extends BaseTest
{
	@Test
	public void click_vote() 
	{
		//To find one radio button of vote Polling and click
		driver.findElement(By.id("pollanswers-1")).click();
		
		//To click the Vote Button
		driver.findElement(By.xpath("//input[@value='Vote']")).click();
	}

}
