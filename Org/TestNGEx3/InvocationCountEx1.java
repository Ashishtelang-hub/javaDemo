package Org.TestNGEx3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Org.BasicPrograme.BaseUtility;


public class InvocationCountEx1 {
	
	@Test (invocationCount = 3)
	public void validateDashboardTitle() {

		System.out.println("*** Programe Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "https://online.actitime.com/atelang/login.do";
		WebDriver driver = bu.StartUp("ch", url);
		//driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ashishdtelang@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("nGb8ar65");
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
		//Thread.sleep(5000);
		bu.waitForVisibilityOfWebElementByType(driver,10,"id","logoutLink");
		driver.findElement(By.id("logoutLink")).click();
		System.out.println("**** Programe Ends ***");
	}
}
