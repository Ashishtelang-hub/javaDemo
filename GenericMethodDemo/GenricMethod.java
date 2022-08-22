package GenericMethodDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenricMethod {
	WebDriver driver;
 public WebDriver invoke(String url) {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.get(url);
	 return driver; 
 }
 public WebDriver id(String id) {
	WebElement ele =  (WebElement) driver.findElement(By.id(id));
			//((org.openqa.selenium.WebElement) driver).sendKeys("Ashish");;
	//String  str = ele.getClass(); //We not getText() method here.
	
	return driver;
	 
 }
}
