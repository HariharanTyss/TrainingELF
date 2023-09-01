package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase5 {

	public static void main(String[] args) throws InterruptedException 
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
		
		//add the product
		driver.findElement(By.id("small-searchterms")).sendKeys("computing");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		Thread.sleep(2000);
		

		//add the product
		driver.findElement(By.id("small-searchterms")).sendKeys("Jewelry");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("product_attribute_71_10_16")).sendKeys("1");
		driver.findElement(By.id("product_attribute_71_11_17_50")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		Thread.sleep(2000);

		//add the product
		driver.findElement(By.id("small-searchterms")).sendKeys("music");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		Thread.sleep(2000);
		
		//To get price of product
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		
		//driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
		Thread.sleep(6000);
		//driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("10");
		String price1 = driver.findElement(By.xpath("(//span[@class='product-subtotal'])[1]")).getText();
		String price2 = driver.findElement(By.xpath("(//span[@class='product-subtotal'])[2]")).getText();
		String price3 = driver.findElement(By.xpath("(//span[@class='product-subtotal'])[3]")).getText();
		System.out.println("Price is :"+price1);
		System.out.println("Price is :"+price2);
		System.out.println("Price is :"+price3);
		//driver.close();
		
	}

}
