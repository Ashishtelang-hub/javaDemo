package Org.alertPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Org.BasicPrograme.BaseUtility;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("*** Programe Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/alerts";
		WebDriver driver = bu.StartUp("ch", url);
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.id("promtButton"));
		bu.scrollByJs(driver, ele);
		
		ele.click();
		
		//Alert alt = driver.switchTo().alert();
		
//		System.out.println("text :" + alt.getText());
//		alt.sendKeys("18 March");
//		alt.accept();
		//alt.dismiss();
	//	driver.quit();
		System.out.println("*** Programe Ends ****");

	}

}
