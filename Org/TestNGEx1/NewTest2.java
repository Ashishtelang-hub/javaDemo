package Org.TestNGEx1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Org.BasicPrograme.BaseUtility;


public class NewTest2 {
	
	private WebDriver driver;
	@BeforeMethod
	public void login() {
		BaseUtility bu = new BaseUtility();
		String url = "https://online.actitime.com/atelang/login.do";
		 driver = bu.StartUp("ch", url);
		//driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ashishdtelang@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("nGb8ar65");
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
		bu.waitForVisibilityOfWebElementByType(driver,10,"id","logoutLink");
		
		System.out.println("Log In Successful");
		
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
		System.out.println("LogOut Successful");
	}
  @Test
  public void validateDashboartTitle() {
	  
		
		
				String actURL = driver.getCurrentUrl();
		String expDashURL = "https://online.actitime.com/atelang/administration/userlist.do#page-1";
		System.out.println("actURL"+ actURL);
		if(actURL.equals(expDashURL)) {
			System.out.println("DashBoard Title verified Successfully");
		}else {
			System.out.println("DashBoard Title Change"); 
			
		}
		
  }
  @Test
  public void validateDashboartUrl() {
	  
		
		
		String actDashTitle = driver.getTitle();
		String expDashTitle = "actiTIME-Enter Time Track";
		System.out.println("actDashTitle" + actDashTitle);
		if(actDashTitle.equals(expDashTitle)) {
			System.out.println("DashBoard Title url verified Successfully");
		}else {
			System.out.println("DashBoard Title Not Matched verified Successfully");
		}
		
		
  }
  
}
