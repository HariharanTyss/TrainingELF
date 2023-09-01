package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class work_with_locators 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("computer");
		Thread.sleep(2000);
		List<WebElement> all_sugg = driver.findElements(By.xpath("//span[contains(text(),'computer')]"));
		int size=all_sugg.size();
		System.out.println("Size of Suggestion :"+size);
		for (int i = 0; i <=size-1; i++) 
		{
			String text = all_sugg.get(i).getText();
			System.out.println(text);
			
		}
		
		
		
		
		
		
		
		
	}

}
