package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_all_links {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		List<WebElement> list_book = driver.findElements(By.xpath("//a"));
		System.out.println("size :"+list_book.size());
		for (int i = 0; i <=list_book.size()-1 ; i++) 
		{
		
			String value = list_book.get(i).getText();
			System.out.println(value);
		}
	
		driver.quit();
	}

}
