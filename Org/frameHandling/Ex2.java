package Org.frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Org.BasicPrograme.BaseUtility;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("*** Programe Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/frames";
		WebDriver driver = bu.StartUp("ch", url);
		driver.manage().window().maximize();
		
		WebElement f1 =driver.findElement(By.id("frame1Wrapper"));
		driver.switchTo().frame(1);
		
		String txt1 = driver.findElement(By.id("sampleHeading")).getText(); // not working
		System.out.println("Text is :" + txt1);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		String txt2 = driver.findElement(By.id("sampleHeading")).getText(); // not working
		System.out.println("Text is :" + txt2);
		driver.quit();
		System.out.println("*** Programe End ***");

	}

}
