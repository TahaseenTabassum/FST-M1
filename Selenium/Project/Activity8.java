package testNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();

		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	}

	@Test
	public void testCase8() throws InterruptedException {
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		
		String user=driver.findElement(By.xpath("//span[@class='display-name']")).getText();
		Assert.assertEquals("root", user);

	}

	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}

}
