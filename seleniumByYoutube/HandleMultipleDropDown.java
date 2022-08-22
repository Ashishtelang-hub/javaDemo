package seleniumByYoutube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleDropDown {
	// HandleMultipleDropDown method using generic method

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		Select numOftext = new Select(  (WebElement) driver.findElements(By.id("oldSelectMenu")));
		numOftext.selectByValue("5");

	}

}
