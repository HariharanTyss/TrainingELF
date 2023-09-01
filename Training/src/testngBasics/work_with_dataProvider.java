package testngBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class work_with_dataProvider 
{
	@DataProvider(name="TstData")
	public Object[][] testdata()
	{
		Object[][] data=new Object[2][5];
		
		data[0][0] ="Hariharan";
		data[0][1] ="M";
		data[0][2] ="harry123@gmail.com";
		data[0][3] ="aaaaaa";
		data[0][4] ="aaaaaa";
		
		data[1][0] ="Hari";
		data[1][1] ="M";
		data[1][2] ="harry567@gmail.com";
		data[1][3] ="bbbbbb";
		data[1][4] ="bbbbbb";
		
		return data;
		
	}
	@Test(dataProvider = "TstData")
	public void demoDataProvider(String fn,String ln,String mail,String pwd,String cpwd ) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys(fn);
		driver.findElement(By.id("LastName")).sendKeys(ln);
		driver.findElement(By.id("Email")).sendKeys(mail);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cpwd);
		driver.quit();
		
		
	}
	
	
	
	

}
