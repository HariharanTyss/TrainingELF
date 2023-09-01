package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import frameworkUtility.BaseTest;

public class Testcase1 extends BaseTest {
	@Test
	public void testcase1() throws InterruptedException {
		driver.get("https://demowebshop.tricentis.com/");

		//To login with Un and pwd
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("rajatys@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Hari1234@");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

		//Navigate to the Information Section
		Actions ac=new Actions(driver);
		//ac.moveToElement(driver.findElement(By.xpath("//h3[contains(text(),'Information')]"))).contextClick().perform();
		ac.sendKeys(Keys.PAGE_DOWN).perform();

		driver.findElement(By.partialLinkText("Sitemap")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Search")).click();
		driver.findElement(By.id("Q")).sendKeys("computing");
		driver.findElement(By.xpath("(//input[@value='Search'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		Thread.sleep(2000);
		String result_text = driver.findElement(By.xpath("//p[@class='content']")).getText();
		System.out.println(result_text);
		driver.close();

		//To Log out
		driver.findElement(By.partialLinkText("Log out")).click();


	}

}
