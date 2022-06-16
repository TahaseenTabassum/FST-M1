package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.training-support.net");

		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		
		WebElement aboutUs= driver.findElement(By.xpath("//a[@id='about-link']"));
		aboutUs.click();
		
		System.out.println("New Page title is: "+ driver.getTitle());
		driver.close();
	}
}
