package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementVsFindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	/*	//Find Element --> Returns a single web element
		
		//1
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("Vivo");
		//2
		WebElement ele=driver.findElement(By.xpath("//div[@id='navFooter']//a"));
		System.out.println(ele.getText());
		//3
	//	WebElement searchButton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		//it will show no such element exception
		WebElement searchButton=driver.findElement(By.xpath("//input[@id='nav-login-submit-button']")); 
		*/
		// FindElements-->
		
		List<WebElement>links=driver.findElements(By.xpath("//div[@id='navFooter']//a"));
		System.out.println("Numbers of elements captured" +  links.size());
		

	}

}
