package testNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();

		driver.get("https://alchemy.hguy.co/jobs/");
	}

	@Test
	public void testCase3() {

		String imgURL=driver.findElement(By.xpath("//div[@class='post-thumb-img-content post-thumb']/img")).getAttribute("src");

		System.out.println("URL of the header image " + imgURL);


	}

	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}

}
