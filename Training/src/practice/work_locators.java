package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class work_locators {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//using Partial Linktext locator
		driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.partialLinkText("Reg")).click();
		driver.findElement(By.partialLinkText("oppi")).click();
		
		//using tagname locator
		driver.findElement(By.tagName("input")).sendKeys("mobiles");
		driver.findElement(By.tagName("input")).clear();
		driver.findElement(By.tagName("input")).sendKeys("Earphones");
		driver.findElement(By.tagName("input")).clear();
		
		//Using Css Selector
		driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("Computer");
		driver.findElement(By.cssSelector("input[value='Search store']")).clear();
		driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("lenovo");
		
		//
		
		
	}

}
