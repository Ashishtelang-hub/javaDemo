package Org.BasicPrograme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class WebDriverManagerEx1 {

	public static void main(String[] args) {
		System.out.println("*** Programe Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "https://online.actitime.com/atelang/login.do";
		WebDriver driver = bu.StartUp("ch", url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ashishdtelang@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("nGb8ar65");
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
		bu.waitForVisibilityOfWebElementByType(driver,10,"id","logoutLink");
		driver.findElement(By.id("logoutLink")).click();
		
		System.out.println("*** Programe End ***");

	}

}
