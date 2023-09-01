package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class work_with_action_2 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    
	    /*driver.get("https://www.naukri.com/");
	  //To find the Element
	    WebElement job_link = driver.findElement(By.xpath("(//div[contains(text(),'Jobs')])[1]")); 
	    //To create Object for Actions 
	    Actions a=new Actions(driver);
	    //Move to  the Element
	    a.moveToElement(job_link).build().perform();
	    //Also Find To the Following SubElement and click
	    a.moveToElement(driver.findElement(By.partialLinkText("Jobs by skill"))).click().perform();*/
	    
	   /* driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
	    Actions a=new Actions(driver);
	    a.doubleClick(button).perform();*/
	    
	    
	   /* WebElement right_click = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
	    Actions a=new Actions(driver);
	    a.contextClick(right_click).perform();*/
	    
	    driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    Actions a=new Actions(driver);
	   /* 
	    a.dragAndDrop(driver.findElement(By.id("box1")), driver.findElement(By.xpath("//div[contains(text(),'Italy')]"))).perform();
	    a.dragAndDrop(driver.findElement(By.id("box2")), driver.findElement(By.xpath("//div[contains(text(),'Spain')]"))).perform();
	    a.dragAndDrop(driver.findElement(By.id("box3")), driver.findElement(By.xpath("//div[contains(text(),'Oslo')]"))).perform();
	    a.dragAndDrop(driver.findElement(By.id("box4")), driver.findElement(By.xpath("//div[contains(text(),'Denmark')]"))).perform();
	    a.dragAndDrop(driver.findElement(By.id("box4")), driver.findElement(By.xpath("//div[contains(text(),'Sweden')]"))).perform();
	    a.dragAndDrop(driver.findElement(By.id("box5")), driver.findElement(By.xpath("//div[contains(text(),'Italy')]"))).perform();
	    a.dragAndDrop(driver.findElement(By.id("box6")), driver.findElement(By.xpath("//div[contains(text(),'Italy')]"))).perform();
	    a.dragAndDrop(driver.findElement(By.id("box7")), driver.findElement(By.xpath("//div[contains(text(),'Italy')]"))).perform();
	    */
	    
	}

}
