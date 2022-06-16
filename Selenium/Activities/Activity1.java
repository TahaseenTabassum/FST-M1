package SeleniumActivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1  {
    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        
        //And now use this to visit the website
        driver.get("https://www.tr/aining-support.net");
        
        //Close the browser
        driver.close();
    }
}
