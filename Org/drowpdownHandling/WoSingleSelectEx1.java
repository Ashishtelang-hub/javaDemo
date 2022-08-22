package Org.drowpdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Org.BasicPrograme.BaseUtility;

public class WoSingleSelectEx1 {

	public static void main(String[] args) {
		System.out.println("**** Programe Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = bu.StartUp("ch", url);
		
		WebElement selectValue = driver.findElement(By.cssSelector("div.css-tlfecz-indicatorContainer"));
		selectValue.click();
		System.out.println(driver.getPageSource());
		//For Group1, Option 1
		driver.findElement(By.xpath("//div[text()='Group 1, option 1']")).click();
//		Thread.sleep(1000);
//		//For Group1, Option 2
//		driver.findElement(By.xpath("//div[text()='Group 1, option 2']")).click();
//		Thread.sleep(1000);
//		//For Group2, Option 1
//		driver.findElement(By.xpath("//div[text()='Group 2, option 1']")).click();
//		Thread.sleep(1000);
//		//For Group2, Option 2
//		driver.findElement(By.xpath("//div[text()='Group 2, option 2']")).click()
//		Thread.sleep(1000);
		
		
		System.out.println("**** Programe Ends ***");

	}

}
