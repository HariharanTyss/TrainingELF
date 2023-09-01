package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class work_with_Action_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demowebshop.tricentis.com/");
	    
	   /* //To Find the WebElement
	    WebElement elec_link = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
	    
	    //To Create Object for Actions Class
	    Actions ac=new Actions(driver);
	    
	    //To move to the Element
	    ac.moveToElement(elec_link).build().perform();
	    
	    //To click their child ELement
	    ac.moveToElement(driver.findElement(By.partialLinkText("Accessories"))).click().perform();*/
	    
	    WebElement search_box = driver.findElement(By.name("q"));
	    Actions a=new Actions(driver);
	    a.moveToElement(search_box).click().sendKeys("Mobiles").perform();
	    Thread.sleep(2000);
	    a.moveToElement(driver.findElement(By.xpath("//input[@value='Search']"))).click().perform();
	    Thread.sleep(2000);
	    a.sendKeys(Keys.PAGE_DOWN).perform();

	}

}
