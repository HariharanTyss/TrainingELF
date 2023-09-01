package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class work_with_Xpath {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input [@id='FirstName']")).sendKeys("Hariharan");
		driver.findElement(By.xpath("//input [@id='LastName']")).sendKeys("M");
		driver.findElement(By.xpath("//input [@id='Email']")).sendKeys("harryharry112@gmail.com");
		driver.findElement(By.xpath("//input [@id='Password']")).sendKeys("Harryfit123");
		driver.findElement(By.xpath("//input [@id='ConfirmPassword']")).sendKeys("Harryfit123");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		String reslut_text = driver.findElement(By.xpath("//div[@class='result']")).getText();
		if ( reslut_text=="Your registration completed")
		{
		System.out.println(reslut_text);
		}
		else
			System.out.println("Email is Already Registered ");
		driver.close();
	}

}
