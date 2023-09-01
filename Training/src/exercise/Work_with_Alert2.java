package exercise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Work_with_Alert2 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("cusid")).sendKeys("QSP");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		//To Handle Alert and printing the ALerts text
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.dismiss();
		
		driver.quit();
		
		
		

	}

}
