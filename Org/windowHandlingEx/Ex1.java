package Org.windowHandlingEx;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Org.BasicPrograme.BaseUtility;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("*** Programe Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/browser-windows";
		WebDriver driver = bu.StartUp("ch", url);
		driver.manage().window().maximize();
		
		
		String parentId1 = driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();
		String parentId2 = driver.getWindowHandle();
		System.out.println("parentId1 " + parentId1);
		System.out.println("parentId2 " + parentId2);
		
		Set<String> allWinIds = driver.getWindowHandles();
		System.out.println("Number of windows :" + allWinIds.size());
		
		Iterator<String> itr = allWinIds.iterator();
		String id1 = itr.next();
		System.out.println("id1 " + id1);
		
		if(id1.equals(parentId1)) {
			id1 = itr.next();
		}
		
		driver.switchTo().window(id1);
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("text :" + text);
//		String id2 = itr.next();
//		System.out.println("id2 " + id2);
		driver.quit();
		System.out.println("*** Programe Ends ***");

	}

}
