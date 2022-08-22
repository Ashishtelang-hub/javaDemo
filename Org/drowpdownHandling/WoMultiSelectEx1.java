package Org.drowpdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Org.BasicPrograme.BaseUtility;

public class WoMultiSelectEx1 {

	public static void main(String[] args) {
		System.out.println("**** Programe Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = bu.StartUp("ch", url);

		WebElement selectValue = driver.findElement(By.xpath("//div[text()='Select...']"));
		//selectValue.click();
		//bu.scrollByJs(driver,selectValue);
		WebElement bodyTag = driver.findElement(By.tagName("body"));
		bodyTag.sendKeys(Keys.PAGE_DOWN);
		
		System.out.println(driver.getPageSource());
		driver.findElement(By.xpath("//option[text()='Red']")).click();
		driver.findElement(By.xpath("//option[text()='Blue']")).click();
		driver.findElement(By.xpath("//option[text()='White']")).click();


		System.out.println("**** Programe Ends ***");
	}

}
