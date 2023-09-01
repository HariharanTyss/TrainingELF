package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class work_with_MultipleWindow {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/");
	    
	    //To get the ParentWIndow ID
	    String Parent_window = driver.getWindowHandle();
	    System.out.println(Parent_window);
	    
	    //To find facebook link And CLick
	    driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
	    
	    //To Identify child and parent Window
	    Set<String> child_window = driver.getWindowHandles();
	    System.out.println(child_window);
	    
	    //To close only Child WIndow
	    for (String windw: child_window) 
	    {
	    	driver.switchTo().window(windw);
	    	Thread.sleep(1000);
	    	
	    	if(!Parent_window.equals(windw)) 
	    	{
	    		driver.close();
	    	}	
		}
	    driver.switchTo().window(Parent_window);
	    driver.findElement(By.name("q")).sendKeys("Mobiles");
	    driver.findElement(By.xpath("//input[@value='Search']")).click();
	   
	}
}
