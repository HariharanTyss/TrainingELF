package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class work_with_Alerts 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		/*
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		Actions a=new Actions(driver);
		a.moveToElement(button).doubleClick().perform();
		Thread.sleep(2000);
		
		//To Handle ALert And getting text of Alert
		String alert_msg = driver.switchTo().alert().getText();
		System.out.println(alert_msg);
		driver.switchTo().alert().accept();
		*/
		Actions al=new Actions(driver);
		
		List<WebElement> button = driver.findElements(By.xpath("//span[contains(text(),'right click me')]"));
		int count = button.size();
		System.out.println("count :"+count);
		
		driver.quit();
	
	
	}

}
