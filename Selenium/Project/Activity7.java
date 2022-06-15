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

public class Activity7 {
	WebDriver driver;

	
	WebDriverWait wait;
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://alchemy.hguy.co/jobs/");
	}

	@Test
	public void testCase7() throws InterruptedException {

		driver.findElement(By.linkText("Post a Job")).click();
		driver.findElement(By.id("create_account_email")).sendKeys("test11@ibm.com");
		
		driver.findElement(By.xpath("//input[@id='job_title']")).sendKeys("Atomation1");
		
		driver.switchTo().frame("job_description_ifr");
		driver.findElement(By.id("tinymce")).sendKeys("Test Job");
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@id='application']")).sendKeys("http://www.ibm.com");
		
		driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("IBM");
		
		driver.findElement(By.xpath("//input[@name='submit_job']")).click();
		
		driver.findElement(By.xpath("//input[@id='job_preview_submit_button']")).click();
		
		driver.findElement(By.linkText("Jobs")).click();
		driver.findElement(By.id("search_keywords")).sendKeys("Atomation1");
		
		driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Atomation1']")));
		
		
		String job=driver.findElements(By.xpath("//h3")).get(0).getText();
		
		Assert.assertEquals("Atomation1", job);

	}

	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}

}
