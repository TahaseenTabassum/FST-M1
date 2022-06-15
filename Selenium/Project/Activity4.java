package testNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();

		driver.get("https://alchemy.hguy.co/jobs/");
	}

	@Test
	public void testCase4() {

		String secondHeader=driver.findElement(By.xpath("//h2")).getText();

		System.out.println("Second Heading of the webpage: " + secondHeader);

		Assert.assertEquals("Quia quis non", secondHeader);

	}

	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}

}
