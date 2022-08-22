package Org.BasicPrograme;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ImplicitExplicitWaitEx {

	public static void main(String[] args) {
		System.out.println("***Programe Start***");
		BaseUtility bu = new BaseUtility();
		String url ="https://online.actitime.com/atelang/login.do";
		WebDriver driver = bu.StartUp("ch", url);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ashishdtelang@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("nGb8ar65");
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
//		WebElement ClickOnLogout = driver.findElement(By.className("panelTrigger"));
//		ClickOnLogout.click();
		WebElement logout = driver.findElement(By.id("logoutLink"));
	
//    	WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wt.until(ExpectedConditions.visibilityOf(logout));
		bu.waitForVisibilityOfWebElementByType(driver,10,"id","logoutLink");		
		
		logout.click();
		
		
		System.out.println("***Programe End***");

	}

}
