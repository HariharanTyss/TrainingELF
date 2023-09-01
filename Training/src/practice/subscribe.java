package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class subscribe 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.name("NewsletterEmail")).sendKeys("harryharry@gmail.com");
		boolean subscribe_btn = driver.findElement(By.id("newsletter-subscribe-button")).isDisplayed();
		if ( subscribe_btn==true)
		{
			driver.findElement(By.id("newsletter-subscribe-button")).click();
		}
	}

}
