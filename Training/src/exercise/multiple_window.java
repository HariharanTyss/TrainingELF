package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class multiple_window {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();

		//To open parent window
		String title = driver.getTitle();
		System.out.println("Title of Page :"+title);

		Actions a=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//span"));
		a.moveToElement(ele).contextClick().perform();
		Thread.sleep(1000);
		 List<WebElement> list_rghtclk_btn = driver.findElements(By.xpath("(//ul)[3]"));
		 
		 int count=list_rghtclk_btn.size();
		 for (WebElement list : list_rghtclk_btn) 
		 {
			 String text=list.getText();
			 System.out.println(text);
			
		}
		 driver.close();
		//a.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Copy')]"))).click().perform();

	}

}
