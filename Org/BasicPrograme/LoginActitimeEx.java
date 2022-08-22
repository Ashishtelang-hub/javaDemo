package Org.BasicPrograme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginActitimeEx {

	public static void main(String[] args) {
		System.out.println("*** Programe Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "https://online.actitime.com/atelang/login.do";
		WebDriver driver = bu.StartUp("ch", url);
		driver.manage().window().maximize();
		
		WebElement UserNameFiled = driver.findElement(By.xpath("//input[@id='username']"));
		UserNameFiled.sendKeys("ashishdtelang@gmail.com");
		
		WebElement UserPwdFiled = driver.findElement(By.xpath("//input[@name=\"pwd\"]"));
		UserPwdFiled.sendKeys("nGb8ar65");
		
		WebElement ClickOnLogin = driver.findElement(By.xpath("//a[@id=\"loginButton\"]"));
		ClickOnLogin.click();
		
		WebElement ClickOnLogout = driver.findElement(By.xpath("//a[@id=\"logoutLink\"]"));
		ClickOnLogout.click();
		System.out.println("*** Programe End ***");


	}



}
