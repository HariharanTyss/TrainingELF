package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		

		//To login with Un and pwd
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("rajatys@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Hari1234@");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		//To find Shipping & Returns link
		//Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Shipping & Returns")).click();
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("(//p)[1]")).getText();
		System.out.println(text);
		
		 //To Log out
        driver.findElement(By.partialLinkText("Log out")).click();

		
		
		

	}

}
