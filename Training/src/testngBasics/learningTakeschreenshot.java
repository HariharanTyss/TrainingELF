package testngBasics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class learningTakeschreenshot 
{
	@Test
	public void Takescreenshot() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("./screenshot/FirstScreenshot.png");
		FileHandler.copy(temp, dest);
		
		WebElement regstr_link = driver.findElement(By.partialLinkText("Register"));
		File temp1 = regstr_link.getScreenshotAs(OutputType.FILE);
		File dest1= new File("./screenshot/webelemntScreenshot.png");
		FileHandler.copy(temp1, dest1);
		driver.close();
		

	}

}
