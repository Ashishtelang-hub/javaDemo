package Org.BasicPrograme;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;


public class ImplicitExplicitWaitEx2 {

	public static void main(String[] args) {
		System.out.println("***Programe Start***");
		BaseUtility bu = new BaseUtility();
		String url ="https://online.actitime.com/atelang/login.do";
		WebDriver driver = bu.StartUp("ch", url);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ashishdtelang@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("nGb8ar65");
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
//		
		WebElement logout = driver.findElement(By.id("logoutLink"));
	
//    	WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wt.until(ExpectedConditions.visibilityOf(logout));
		bu.waitForVisibilityOfWebElementByType(driver,10,"id","logoutLink");	
		
		FluentWait<WebDriver> wt = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
		        .pollingEvery(Duration.ofMillis(100))
		        .ignoring(NoSuchElementException.class);
		
//		WebElement logout1 = wt.until(new Function<WebDriver, WebElement>(){
//			public WebElement apply(WebDriver driver) {
//				return driver.findElement(By.id("logoutLink"));
//			}
//		});
				
		
	logout.click();
		
		
		System.out.println("***Programe End***");

	}

}
