package Org.BasicPrograme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginLogoutActitimeEx1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("*** Programe Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "https://online.actitime.com/atelang/login.do";
		WebDriver driver = bu.StartUp("ch", url);
		//driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ashishdtelang@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("nGb8ar65");
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
		//Thread.sleep(5000);
		
		String actDashTitle = driver.getTitle();
		String expDashTitle = "actiTIME-Enter Time Track";
		System.out.println("actDashTitle" + actDashTitle);
		if(actDashTitle.equals(expDashTitle)) {
			System.out.println("Login Successfully");
		}else {
			System.out.println("Unable to Login");
		}
		System.out.println("*********************");
		String actURL = driver.getCurrentUrl();
		String expDashURL = "https://online.actitime.com/atelang/administration/userlist.do#page-1";
		System.out.println("actURL"+ actURL);
		if(actURL.equals(expDashURL)) {
			System.out.println("DashBoard URL matched");
		}else {
			System.out.println("DashBoard URL is not matched"); 
			
		}
	//	Thread.sleep(3000);
		
		driver.findElement(By.id("logoutLink")).click();
		System.out.println("*** Programe End ***");

	}

}
