package Org.BasicMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Org.BasicPrograme.BaseUtility;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("***Programe Start***");
		BaseUtility bu = new BaseUtility();
		String url ="https://online.actitime.com/atelang/login.do";
		WebDriver driver = bu.StartUp("ch", url);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ashishdtelang@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("nGb8ar65");
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
		bu.waitForVisibilityOfWebElementByType(driver,10,"id","logoutLink");
	
		List<WebElement> allTabs =  driver.findElements(By
		.cssSelector("td[class ^='navItem preventPanelsHiding navCell']>a"));
		WebElement tt = allTabs.get(0);
		String value = tt.getAttribute("class");
		System.out.println("value " + value);
		if(value.contains("selected")) {
			System.out.println("Time Track table is selected");
		}else {
			System.out.println("Time Track table is not selected");
		}
		driver.findElement(By.id("logoutLink")).click();
		System.out.println("*** Programe Ends ***");
	}
	

}
