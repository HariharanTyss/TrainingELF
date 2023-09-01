package exercise;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class work_with_multipleWindow 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/92");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		
		//To Identify Parent Window
		String Parent_window = driver.getWindowHandle();
		System.out.println(Parent_window);
		
		//To find the button which will open child window
		driver.findElement(By.id("compare")).click();
		Thread.sleep(1000);
		
		//To Get the child Window along parent
		Set<String> Child_window = driver.getWindowHandles();
		System.out.println(Child_window);
		
		
		//switch to child Window
		for (String child_tab : Child_window) 
		{
			
		
			driver.switchTo().window(child_tab);
			String title = driver.getTitle();
			System.out.println(title);
			if (title.equals("www.amazon.in")) 
			{
				
			}
			else 
			{
				driver.close();
			}
			
			Thread.sleep(1000);
		
			
		}
	}

}
