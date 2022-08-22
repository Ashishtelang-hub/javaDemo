package Org.drowpdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Org.BasicPrograme.BaseUtility;

public class MultiSelectEx1 {

	public static void main(String[] args) {
		System.out.println("*** Programe Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = bu.StartUp("ch", url);
		driver.manage().window().maximize();
		
		WebElement carDDL = driver.findElement(By.id("cars"));
		bu.scrollByJs(driver, carDDL);
		
		Select sel = new Select(carDDL);
		sel.selectByVisibleText("Audi");
		sel.selectByIndex(3);
		//sel.selectByValue("4");
		
	for(int i=0; i<sel.getOptions().size(); i++) {
		sel.selectByIndex(i);
	}
		List<WebElement>ar = sel.getAllSelectedOptions();
//		ArrayList<String> actSelected = bu.getDropdownAllOptionsText(ar);
		
		System.out.println("*** Programe Ends ****");
				

	}

}
