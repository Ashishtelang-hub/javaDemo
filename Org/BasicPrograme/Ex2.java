package Org.BasicPrograme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex2 {

	public static void main(String[] args) {
		String bName = "ch";
		WebDriver driver = null;
		if(bName.equalsIgnoreCase("ch")|| bName.equalsIgnoreCase("Chrome")) {
			System.out.println("Chrome Browser successfully open");
			System.setProperty("webdriver.chrome.driver", "E:\\Browser\\chromedriver.exe");
			ChromeDriver obj = new ChromeDriver();
			
		}else if(bName.equalsIgnoreCase("ff")||bName.equalsIgnoreCase("Firefox")) {
			System.out.println("Firefox Browser successfully open");
			System.setProperty("webdriver.gecko.driver", "E:\\Browser\\geckodriver.exe");
	     	FirefoxDriver obj = new FirefoxDriver();
			
		}else if(bName.equalsIgnoreCase("edge")) {
			System.out.println("Edge Browser successfully open");
			System.setProperty("webdriver.edge.driver", "E:\\Browser\\msedgedriver.exe");
			EdgeDriver obj = new EdgeDriver();
			
		}else {
			System.out.println("Invalid Browser");
		}
		//driver.manage().window().maximize();
		
	
}


	
}
