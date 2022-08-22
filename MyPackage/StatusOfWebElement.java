package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfWebElement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// is Display and isEnable
//		driver.get("https://www.google.co.in/");
//		
//		WebElement searchStore=driver.findElement(By.name("q"));
//		
//		System.out.println("Display status " + searchStore.isDisplayed());
//		
//		System.out.println("Enable status " + searchStore.isEnabled());
//		// isSelected - radio button, check box, dropbown
		driver.get("https://demoqa.com/radio-button");
		
		WebElement yesRadiobutton = driver.findElement(By.xpath("//label[contains(text(),'Yes')]"));
		
		WebElement impressiveRadiobutton = driver.findElement(By.xpath("//label[contains(text(),'Impressive')]"));
		
	//	WebElement noRadiobutton = driver.findElement(By.xpath("//label[contains(text(),'No')]"));
		
		System.out.println(yesRadiobutton.isSelected()); //flase
		System.out.println(impressiveRadiobutton.isSelected()); //flase
	//	System.out.println(noRadiobutton.isSelected()); // Flase
		
		yesRadiobutton.click();
		System.out.println(yesRadiobutton.isSelected()); //True
		System.out.println(impressiveRadiobutton.isSelected()); //flase
	//	System.out.println(noRadiobutton.isSelected()); // Flase
		
		impressiveRadiobutton.click();
		System.out.println(yesRadiobutton.isSelected()); //False
		System.out.println(impressiveRadiobutton.isSelected()); //True
	//	System.out.println(noRadiobutton.isSelected()); // Flase
		
//		noRadiobutton.click();
//		System.out.println(yesRadiobutton.isSelected()); //flase
//		System.out.println(impressiveRadiobutton.isSelected()); //flase
//		System.out.println(noRadiobutton.isSelected()); // True
	}

}
