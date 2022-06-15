package testNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity6 {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();

		driver.get("https://alchemy.hguy.co/jobs/");
	}

	@Test
	public void testCase6() throws InterruptedException {

		driver.findElement(By.linkText("Jobs")).click();
		
		driver.findElement(By.id("search_keywords")).sendKeys("Banking");
	
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);

		System.out.println(driver.findElements(By.xpath("//h3")).get(0).getText());
		
		driver.findElements(By.xpath("//h3")).get(0).click();
		
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
		String email= driver.findElement(By.xpath("//a[@class='job_application_email']")).getText();


		System.out.println("Email: "+email);

	}

	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}

}
