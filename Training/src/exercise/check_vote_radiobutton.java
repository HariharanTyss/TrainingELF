package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_vote_radiobutton {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@id='pollanswers-2']")).click();
		driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
		String result_text = driver.findElement(By.xpath("//div[@id='block-poll-vote-error-1']")).getText();
		System.out.println(result_text);
		driver.close();
		
	}

}
