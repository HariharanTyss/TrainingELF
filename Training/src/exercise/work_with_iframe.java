package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class work_with_iframe {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP%20ELITEBOOK/Downloads/iframe.html");
		
		//1.switch to Demo frame using index
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Log in")).click();
		
		//switch to default
		driver.switchTo().defaultContent();
		driver.findElement(By.partialLinkText("Google")).click();
		
		//2.switch to cars frame using Name
		//driver.switchTo().frame("frame2");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(text(),'Discover All')]")).click();
		
		//switch to default
	//	driver.switchTo().defaultContent();
		
		//3.switch to demoframe using webelemnt
	//	driver.switchTo().frame(driver.findElement(By.id("FR1")));
		//driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]")).click();
		
		

	}

}
