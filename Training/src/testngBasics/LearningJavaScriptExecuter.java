package testngBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearningJavaScriptExecuter 
{
	@Test(invocationCount = 0)
	public void Handle_Scrolling() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,1000);");

		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500);");
		
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,3000);");
		
		WebElement ele = driver.findElement(By.partialLinkText("Simple Computer"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
	}
	
	@Test(invocationCount = 0)
	public void Handle_DisableELe() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement disable_ele = driver.findElement(By.xpath("//input[@class='form-control']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='Qspiders';", disable_ele);
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='Jspiders';", disable_ele);
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='PYspiders';", disable_ele);
		
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		driver.findElement(By.xpath("//a[contains(text(),'jdk-8u371-linux-aarch64.rpm')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'jdk-8u371-linux-aarch64.rpm')]"));Download jdk-8u371-linux-aarch64.rpm
		
		
		driver.quit();
	}
	
	@Test
	public void Handle_HiddenEle() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("hide-textbox")).click();
		
		WebElement ele = driver.findElement(By.id("displayed-text"));
		 Point loc = ele.getLocation();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");
		js.executeScript("arguments[0].value='Qspiders'", ele);
		driver.findElement(By.id("show-textbox")).click();
		
		System.out.println("X coordinates"+loc.getX());
		System.out.println("Y coordinates"+loc.getY());
	}
	

}
