package Org.BasicPrograme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex1 {

	public static void main(String[] args) {
		Ex1 obj = new Ex1();
		
		obj.openChromeBrowser();
		obj.openFirefoxBrowser();
		obj.openEdgeBrowser();
	
}

	private void openEdgeBrowser() {
		System.out.println("Edge Browser successfully open");
		System.setProperty("webdriver.edge.driver", "E:\\Browser\\msedgedriver.exe");
		EdgeDriver obj = new EdgeDriver();
		
	}

	private void openFirefoxBrowser() {
		System.out.println("Firefox Browser successfully open");
		System.setProperty("webdriver.gecko.driver", "E:\\Browser\\geckodriver.exe");
     	FirefoxDriver obj = new FirefoxDriver();
		
	}

	private void openChromeBrowser() {
		System.out.println("Chrome Browser successfully open");
		System.setProperty("webdriver.chrome.driver", "E:\\Browser\\chromedriver.exe");
		ChromeDriver obj = new ChromeDriver();
		
	}
	
}
