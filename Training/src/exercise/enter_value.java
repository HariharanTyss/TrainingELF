package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class enter_value {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://elftestingserver/domain/Online_Food_Ordering_System");
		driver.manage().window().maximize();
//		List<WebElement> text_field = driver.findElements(By.xpath("//input[@name='fname']"));
//		for (int i = 0; i <=text_field.size()-1; i++) 
//		{
//			text_field.get(i).sendKeys("Harry");
//		}
//		

	}

}
