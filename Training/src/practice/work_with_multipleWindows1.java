package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class work_with_multipleWindows1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("file:///C:/Users/HP%20ELITEBOOK/Downloads/MultipleWindow.html");
	    
	    //To get Address of parent 
	    String parent_win = driver.getWindowHandle();
	    String parent_title = driver.getTitle();
	    System.out.println(parent_title);
	    
	    //To get child window by clicking that open_Child_button
	    driver.findElement(By.tagName("input")).click();
	    Thread.sleep(1000);
	    
	    // TO get child window and store
	    Set<String> child_win = driver.getWindowHandles();
	    
	    //To print all Title exept one child
	    for (String win: child_win) 
	    {
	    	driver.switchTo().window(win);
	    	Thread.sleep(1000);
	    	String title = driver.getTitle();
	    	System.out.println(title);
	    	if(title.equals("Olive Garden Italian Restaurant | Family Style Dining | Italian Food"))
	    	{
	    		
	    	}
	    	else 
	    	driver.close();
	    	Thread.sleep(1000);
		}
	}

}
