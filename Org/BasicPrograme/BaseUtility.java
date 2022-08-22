package Org.BasicPrograme;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtility {

	public WebDriver StartUp(String bName, String url) {
		
		WebDriver driver = null;
		if(bName.equalsIgnoreCase("ch")|| bName.equalsIgnoreCase("Chrome")) {
			System.out.println("Chrome Browser successfully open");
			System.setProperty("webdriver.chrome.driver", "E:\\Browser\\chromedriver.exe");
	//		ChromeOptions options = new ChromeOptions();
//			options.addArguments("Start - Maximized");
			driver = new ChromeDriver();
			
		}else if(bName.equalsIgnoreCase("ff")||bName.equalsIgnoreCase("Firefox")) {
			System.out.println("Firefox Browser successfully open");
			System.setProperty("webdriver.gecko.driver", "E:\\Browser\\geckodriver.exe");
	     	driver = new FirefoxDriver();
			
		}else if(bName.equalsIgnoreCase("edge")) {
			System.out.println("Edge Browser successfully open");
			System.setProperty("webdriver.edge.driver", "E:\\Browser\\msedgedriver.exe");
	    	driver = new EdgeDriver();	
		}else {
			System.out.println("Invalid Browser");
		}
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.manage().window().maximize();
		driver.get(url);
		return driver;
}

	public void waitForVisibilityOfWebElementByType(WebDriver driver, int time, WebElement ele) {
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
		wt.until(ExpectedConditions.visibilityOf(ele));
	}

	public void waitForVisibilityOfWebElementByType(WebDriver driver, int time, String locType, String locator) {
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
		switch(locType) {
		case "id" : wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(locator))));
		break;
		case "cssSelector" : wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(locator))));
		break;
		case "xpath": wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(locator))));
		break;
		case "class" : wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(locator))));
		break;
		}
	}

	public void scrollByJs(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
	}
	public void clickByJs(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
	}
	public void scrollByPageDown(WebDriver driver, int numofScrolls) {
		WebElement bodyTag = driver.findElement(By.tagName("body"));
		for(int i=1 ;i<=numofScrolls;i++) {
		//	ele.sendKeys(Keys.PAGE_DOWN);
		}
	}
	// Generic method for dropdownAllOprions
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
	


	

