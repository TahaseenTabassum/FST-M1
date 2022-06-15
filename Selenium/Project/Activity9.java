package testNGActivities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();

		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	}

	@Test
	public void testCase9() throws InterruptedException {

		
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//div[text()='Job Listings ']")).click();
		
		driver.findElement(By.linkText("Add New")).click();
		
		driver.findElement(By.xpath("//textarea[@class='editor-post-title__input']")).sendKeys("Automation");
		
		
		
		
		driver.findElement(By.xpath("//button[text()='Publish…']")).click();
		
		driver.findElement(By.xpath("//button[text()='Publish']")).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Automation")));
		
	
		driver.findElement(By.linkText("Automation")).click();
		
		String job=driver.findElement(By.xpath("//h1")).getText();
		Assert.assertEquals("Automation", job);

	}

	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}

}
