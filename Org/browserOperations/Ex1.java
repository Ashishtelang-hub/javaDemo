package Org.browserOperations;

import org.openqa.selenium.WebDriver;
import Org.BasicPrograme.BaseUtility;

public class Ex1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("*** Programe Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "https://www.google.co.in/";
		WebDriver driver = bu.StartUp("ch", url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();
		System.out.println("*** Programe Ends ****");
	}

}
