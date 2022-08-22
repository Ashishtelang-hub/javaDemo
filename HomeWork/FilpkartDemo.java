package HomeWork;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FilpkartDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Browser\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		
		Action sendEsc = actions.sendKeys(Keys.ESCAPE).build();
		
		sendEsc.perform();
		
		System.out.println("***Programe Starts***");
		driver.get("https://www.flipkart.com/");
		System.out.println("You are on Flipkart");
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		driver.findElement(By.name("q")).sendKeys("OnePlue Mobile");
		driver.findElement(By.tagName("button")).click();
		
		Action sendPageDown = actions.sendKeys(Keys.PAGE_DOWN).build();
		sendPageDown.perform();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String xpathonRow = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]";
		
		WebElement listtotal = driver.findElement(By.xpath(xpathonRow));
		
		//System.out.println("Total no. of rows" + ((Object) listtotal).size());
		

		System.out.println("***Programe End***");
	}

}
