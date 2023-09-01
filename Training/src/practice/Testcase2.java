package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase2 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//To login with Un and pwd
		//driver.findElement(By.partialLinkText("Log in")).click();
		//driver.findElement(By.id("Email")).sendKeys("rajatys@gmail.com");
		//driver.findElement(By.id("Password")).sendKeys("Hari1234@");
		//driver.findElement(By.xpath("//input[@value='Log in']")).click();
		

		//Navigate to the Information Section
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//h3[contains(text(),'Information')]"))).perform();
		ac.sendKeys(Keys.PAGE_DOWN).perform();
		
		//To verify all Content is link or not
		List<WebElement> list_inform1 = driver.findElements(By.xpath("//a[contains(text(),'Sitemap')]/../../li"));
		for (int i = 0; i <=list_inform1.size()-1; i++) 
		{
			List<WebElement> list_inform = driver.findElements(By.xpath("//a[contains(text(),'Sitemap')]/../../li"));
			
			String content=list_inform.get(i).getText();
			
			WebElement link = driver.findElement(By.partialLinkText(content));
			String tagname = link.getTagName();
			if(tagname.equals("a"))
			{
				System.out.println(content+":pass");
				link.click();
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
			}
			Thread.sleep(1000);
		}
		driver.close();
		
		

	}

}
