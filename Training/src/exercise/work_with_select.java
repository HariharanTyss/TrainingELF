package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class work_with_select {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();	

		//To find the Select tag element(listBox)
		WebElement sortby_list = driver.findElement(By.xpath("(//select)[2]"));
		
		//To create a object for select
		Select s=new Select(sortby_list);
		
		//To get all OPtions
		List<WebElement> all_option = s.getOptions();
		
		//To find particular option
		String expect_option = "Name: Z to A";
		for (int i = 0; i <=all_option.size()-1; i++) 
		{
			WebElement sortby_lists = driver.findElement(By.xpath("(//select)[2]"));
			Select ss=new Select(sortby_list);
			if(all_option.get(i).getText().equals(all_option))
			{
				ss.selectByIndex(i);
				System.out.println(i);
			}
		}
		
		
		
	}

}
