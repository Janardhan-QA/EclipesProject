package Sell;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String... d) throws InterruptedException {
		String expectedTitle = "Gmail";
		System.setProperty("webdriver.chrome.driver",
				"/Users/janardhanreddy/Documents/AutomationWorkspace/selenium/chromedriver");
		WebDriver a = new ChromeDriver();
		//a.get("https://www.gmail.com");
		a.navigate().to("https://www.gmail.com");
		
		a.findElement(By.id("identifierId")).sendKeys("kuppilijanardhanreddy@gmail.com");
		a.findElement(By.className("CwaK9")).click();
		Thread.sleep(2000);
		
		a.navigate().back();
		Thread.sleep(2000);
		a.navigate().forward();
		Thread.sleep(2000);
		a.navigate().refresh();
		Thread.sleep(3000);
		a.findElement(By.name("password")).sendKeys("ilovegoogle143");
		WebElement c=a.findElement(By.xpath("//span[text()='Next']"));
		c.click();
		
		
	}

}
