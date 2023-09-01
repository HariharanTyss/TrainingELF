package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class work_with_Id {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//Get Text 
		  String register_text = driver.findElement(By.className("ico-register")).getText();
		System.out.println(register_text);
		  
		String login_text=driver.findElement(By.partialLinkText("log")).getText();
		System.out.println(login_text);
		
		//value Attribute
		System.out.println(driver.findElement(By.id("small-searchterms")).getAttribute("value"));
		 String search_text = driver.findElement(By.id("small-searchterms")).getText();
		 System.out.println(search_text);
		 
		 
		 driver.quit();

	}

}
