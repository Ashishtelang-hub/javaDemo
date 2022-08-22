package seleniumByYoutube;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static void main(String[] args) {
		System.out.println("***** Programe Start *****");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select selectdropdown = new Select(dropDown);
		//selectdropdown.selectByVisibleText("Blue");
		//selectdropdown.selectByIndex(3);
		//selectdropdown.selectByValue("6");
		//select options from dropdown without using method
		 List<WebElement>alloptions = selectdropdown.getOptions();
		 
		 for(WebElement option: alloptions) {
			 
			 if(option.getText().equals("Aqua")) {
				 option.click();
				 break;
			 }
		 }
		 
		 System.out.println("***** Programe Ends *****");

	}

}
