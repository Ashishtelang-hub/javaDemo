package Org.BasicPrograme;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FindElementsEx1 {

	public static void main(String[] args) {
		System.out.println("*** Programe Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "https://online.actitime.com/atelang/login.do";
		WebDriver driver = bu.StartUp("ch", url);
		driver.manage().window().maximize();


    	WebElement credFeilds = driver.findElement(By.cssSelector("td[valign='middle']>input[placeholder]"));
    	//WebElement userNameFeilds = ((WebDriver) credFeilds).get(0);
		

		System.out.println("*** Programe End ***");


	}



}
