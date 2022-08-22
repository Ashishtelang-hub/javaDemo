package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
	//	driver.get("https://www.flipkart.com/");
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back(); //amazon
		
		driver.navigate().forward(); // flipkart
		
		driver.navigate().refresh(); // refresh flipkart
		
		

	}

}
