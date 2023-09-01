package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP%20ELITEBOOK/Downloads/xpath1.html");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[1]")).sendKeys("Computer");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
		
		/*driver.findElement(By.xpath("html/body/div[1]/input[1]")).sendKeys("Hariharan");
		driver.findElement(By.xpath("html/body/div[1]/input[2]")).sendKeys("M");
		driver.findElement(By.xpath(" html/body/div[2]/input[1]")).sendKeys("TestYantra");
		driver.findElement(By.xpath(" html/body/div[2]/input[1]")).sendKeys("Banglore");*/
		
	}

}
