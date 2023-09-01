package exercise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class locators {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
		WebElement ele = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]"));
		System.out.println(ele.getText());
		
//		driver.findElement(By.partialLinkText("Log in")).click();
//		driver.findElement(By.id("Email")).sendKeys("hariharanrathna@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("123456789@");
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
//		
//		
//		driver.findElement(By.partialLinkText("Books")).click();
//		
//		
//		
//		//printing first option of Dropdown
//		WebElement drpdwn = driver.findElement(By.id("products-orderby"));
//		Select st=new Select(drpdwn);
//		List<WebElement> alloptions = st.getOptions();
//		System.out.println(alloptions.get(2).getText());
//		
//		//adding the first Product
//		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]/../../../../../../div[5]/div[1]/div[2]/div[3]/div[2]")).click();
//        driver.findElement(By.partialLinkText("Shopping")).click();
//		//printing product name from cart
//		WebElement productname = driver.findElement(By.xpath("(//td[@class='remove-from-cart'])[1]/../../tr[1]/td[3]"));
//		System.out.println(productname.getText());
//		
//		Assert.assertEquals( driver.getTitle(),"Demo Web Shop. Shopping Cart");
//		SoftAssert asrt =new SoftAssert();
//		asrt.assertEquals( driver.getTitle(), "Demo Web Shop. Shopping Cart", "TILLE VERIFY");
//		driver.quit();

	}

}
