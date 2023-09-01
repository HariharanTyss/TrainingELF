package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class work_with_selectbox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();

		//To Click on Book link
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();

		//To find the select Tag webElement
		WebElement sortby_list = driver.findElement(By.xpath("(//select)[2]"));
		//WebElement display_list = driver.findElement(By.xpath("(//select)[3]"));
		//WebElement viewAs_list = driver.findElement(By.xpath("(//select)[1]"));

		//To create object for select Class
		Select s1=new Select( sortby_list);
		//Select s2=new Select(display_list);
		//Select s3=new Select(viewAs_list);

		//To get All Options
		List<WebElement> all_option_1 = s1.getOptions();
		//List<WebElement> all_option_2 = s2.getOptions();
		//List<WebElement> all_option_3 = s3.getOptions();


		//To print all option 
		for (WebElement options : all_option_1) 
		{
			String text = options.getText();
			System.out.println(text);
		}
		Thread.sleep(5000);
		
		//To Select items on listbox
		for (int i = 0; i <=all_option_1.size()-1; i++) 
		{
			s1.selectByIndex(i);
			
		}
		//To check Particular option
		String expected_option = "";
		for (int i = 0; i <=all_option_1.size()-1; i++) 
		{
			String actual_option =all_option_1.get(i).getText();
			if (actual_option.equals(expected_option))
			{
				
				System.out.println(i);
			}
			
		}
		
		driver.close();

	}

}
