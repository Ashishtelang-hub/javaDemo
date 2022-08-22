package Org.drowpdownHandling;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Org.BasicPrograme.BaseUtility;

public class SingleSelectEx2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("*** Programe Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = bu.StartUp("ch", url);
		driver.manage().window().maximize();
		//Thread.sleep(2000);

		WebElement colourDDL = driver.findElement(By.id("oldSelectMenu"));

		bu.scrollByJs(driver, colourDDL);
		

		Select sel = new Select(colourDDL);
		WebElement selectWebElement = sel.getFirstSelectedOption();
		String defaultColor = selectWebElement.getText();
		if(defaultColor.equals("Red")) {
			System.out.println("Red color is selected by default");
		}else {
			System.out.println("Red color is not selected by default");
		}
		//Step 4:
		ArrayList<String> expList = new ArrayList<String>();
		// add test data from manual test case
		ArrayList<String> actList = new ArrayList<String>();
		
		List<WebElement>colorList = sel.getOptions(); // List<WebElement> import in Java.unit
		
		for(int i=0; i<colorList.size();i++) {
			System.out.println(colorList.get(i).getText());	
		}
		//step 5 : select data in dropdown
		sel.selectByVisibleText("Purple");
//		sel.selectByIndex(5); // o/p : Black
//		sel.selectByValue("7"); // o/p : Violet
        // Step 6: Verify purple color is selected or not?
		System.out.println("*** Programe Ends ***");
	}
	
	
	// Generic Method:
	public ArrayList<String> getDropdownAllOptionsText(WebElement ele) {
		ArrayList<String> ar = new ArrayList<String>();
		Select sel = new Select(ele);
		List<WebElement>allEles = sel.getOptions();
		for(int i=0; i<allEles.size();i++) {
			WebElement ele1 = allEles.get(i);
			String text = ele1.getText();
			ar.add(text);
			ar.add(allEles.get(i).getText());
		}
		return ar;
	}
	}


