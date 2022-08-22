package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
//Question 1. How can launch Browser in WebDriver?
	public static void main(String[] args) {
		// ChromeBrowser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//FireFox Browser
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
		
		//Edge Browser
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver= new EdgeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		System.out.println("Title of the web page is" + driver.getTitle());
		
		System.out.println("Current URL the web page is" + driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());

	}

}
