package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Raja");
		driver.findElement(By.id("LastName")).sendKeys("M");
		driver.findElement(By.name("Email")).sendKeys("ggg");
		driver.findElement(By.name("Password")).sendKeys("Qsp1234@");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Qsp1234@");
		driver.findElement(By.id("register-button")).click();
		driver.quit();
	}

}
