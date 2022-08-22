package Org.windowHandlingEx;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Org.BasicPrograme.BaseUtility;

public class GenericSwitchEx {

	public static void main(String[] args) {
		System.out.println("*** Programe Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/browser-windows";
		WebDriver driver = bu.StartUp("ch", url);
		driver.manage().window().maximize();
		
		
		String parentId = driver.getWindowHandle();
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> allWinIds = driver.getWindowHandles();
		System.out.println("Number of windows :"+ allWinIds.size());
		
		Iterator<String> itr = allWinIds.iterator();
		while(itr.hasNext()) {
			String id = itr.next();
			if(!id.equals(parentId)) {
				driver.switchTo().window(id);
			List<WebElement> eleList =  driver.findElements(By.id("sampleHeading"));
			if(!eleList.isEmpty()) {
				System.out.println("Text :" + eleList.get(0).getText());
				break;
			}
			}
		}
		driver.quit();
		
		System.out.println("*** Programe Ends ***");

	}

}
