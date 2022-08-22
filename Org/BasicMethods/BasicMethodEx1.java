package Org.BasicMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Org.BasicPrograme.BaseUtility;

public class BasicMethodEx1 {

	public static void main(String[] args) {
		System.out.println("**** Programe Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/radio-button";
		WebDriver driver = bu.StartUp("ch", url);
		
		WebElement yesBotn = driver.findElement(By.xpath("//input[@id=\"yesRadio\"]"));
		WebElement yesLabel = driver.findElement(By.cssSelector("input#yesRadio"));
		WebElement impBotn = driver.findElement(By.cssSelector("input#impressiveRadio"));
		WebElement noBotn = driver.findElement(By.cssSelector("input#noRadio"));
		
		if(yesLabel.isDisplayed()) {
			System.out.println("impLabel.isDisplayed " + yesLabel.isDisplayed());
			yesBotn.click();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click", yesBotn);
			driver.findElement(By.xpath("//input[@id='yesRadio']")).click();
			if(yesBotn.isSelected()) {
				System.out.println("Yes radio botton is selected");
			}else {
				System.out.println("Yes radio botton is not selected");
			}
			
		}else {
			System.out.println("impRadio.isDisplayed " + yesLabel.isDisplayed());
		}
		if(noBotn.isEnabled()) {
			System.out.println("No Radio botton is disable");
			System.out.println("noRadio.isEnabled() " + noBotn.isEnabled());
		}else {
			System.out.println("noRadio.is not Enabled() " + noBotn.isEnabled());
		}
		System.out.println("**** Programe Ends ***");
	}

}
