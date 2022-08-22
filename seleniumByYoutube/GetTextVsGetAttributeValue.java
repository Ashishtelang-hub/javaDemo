package seleniumByYoutube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class GetTextVsGetAttributeValue {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("*** Programe Starts ***");
		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement userlogin = driver.findElement(By.id("txtUsername"));
		userlogin.clear();
		userlogin.sendKeys("Admin");

		//capturing text from inbox

		System.out.println("Result from getAttribute() methods:" + userlogin.getAttribute("name"));		
		System.out.println("Result from getText: " + userlogin.getText());

		//LogIn button 

		WebElement button = driver.findElement(By.id("btnLogin"));
		System.out.println(button.getAttribute("type"));
		System.out.println(button.getAttribute("class"));
		System.out.println(button.getText());


		System.out.println("*** Programe Ends ***");
	}

}
