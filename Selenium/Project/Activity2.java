package testNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();

		driver.get("https://alchemy.hguy.co/jobs/");
	}

	@Test
	public void testCase2() {

		String header=driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();

		System.out.println("Heading of the webpage: " + header);

		Assert.assertEquals("Welcome to Alchemy Jobs", header);

	}

	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}

}
