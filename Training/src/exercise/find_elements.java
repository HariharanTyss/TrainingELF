package exercise;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class find_elements {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP%20ELITEBOOK/OneDrive/Desktop/demo.html");
		driver.manage().window().maximize();

		//to find the select Tag webElement
		WebElement car = driver.findElement(By.id("standard_cars"));
		WebElement cars = driver.findElement(By.id("multiple_cars"));

		//create Object to Select Class
		Select s=new Select(cars);
		s.selectByIndex(5);
		Thread.sleep(1000);
		s.selectByValue("hda");
		Thread.sleep(1000);
		s.selectByVisibleText("Land Rover");
		Thread.sleep(1000);
		s.selectByValue("vol");
		boolean rs = s.isMultiple();
		System.out.println(rs);
		if(rs) 
		{
			List<WebElement> all_option = s.getOptions();
			for(int i=0;i<=all_option.size()-1;i++) 
			{
				String name = all_option.get(i).getText();
				System.out.println(name);
				
			}
			driver.close();
			
		}
		
	}

}


