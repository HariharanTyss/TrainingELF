package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class work_Cssmethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//retrive Css value
		 String color_value=driver.findElement(By.partialLinkText("Books")).getCssValue("font-size");
		 System.out.println( color_value);
		 
		 
		String register_color =driver.findElement(By.linkText("Register")).getCssValue("color");
		System.out.println(register_color);
		driver.quit();
	}

}
