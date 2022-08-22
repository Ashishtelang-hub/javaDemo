package Org.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest {
  @Test
  public void titleTest() {
	  String exceptedTitles = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  String actualTitles = driver.getTitle();
	  
	  Assert.assertEquals(actualTitles, exceptedTitles);
	  
	  
	  
  }
}
