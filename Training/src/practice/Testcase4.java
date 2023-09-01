package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase4 {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		

		//To login with Un and pwd
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("rajatys@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Hari1234@");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		

		//To find enquiry page and fill enquiry and submit
		driver.findElement(By.partialLinkText("Contact us")).click();
		driver.findElement(By.id("Enquiry")).sendKeys("Testyantra");
		driver.findElement(By.name("send-email")).click();
		String res=driver.findElement(By.xpath("//div[@class='result']")).getText();
        System.out.println(res);
        
        //To Log out
        driver.findElement(By.partialLinkText("Log out")).click();
      //  driver.quit();
        
	}

}
