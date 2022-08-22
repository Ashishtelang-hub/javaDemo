package Org.drowpdownHandling;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Org.BasicPrograme.BaseUtility;

public class SingleSelectEx1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("*** Programe Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = bu.StartUp("ch", url);
		driver.manage().window().maximize();
		//Thread.sleep(2000);

		WebElement colourDDL = driver.findElement(By.id("oldSelectMenu"));
		
	//	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", colourDDL);
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].scrollIntoView(true);", colourDDL);
		bu.scrollByJs(driver, colourDDL);
		

		Select sel = new Select(colourDDL);
		WebElement selectWebElement = sel.getFirstSelectedOption();
		String defaultColor = selectWebElement.getText();
		if(defaultColor.equals("Red")) {
			System.out.println("Red color is selected by default");
		}else {
			System.out.println("Red color is not selected by default");
		}
		

		System.out.println("*** Programe Ends ***");
	}
	}


