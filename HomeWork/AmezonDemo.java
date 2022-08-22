package HomeWork;

import java.util.Iterator;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmezonDemo {

	public static void main(String[] args) {
		//Setting system properties of ChromeDriver
				System.setProperty("webdriver.chrome.driver", "E:\\Browser\\chromedriver.exe");

				//Creating an object of ChromeDriver
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				//launching the specified URL
				String main = driver.getWindowHandle();
				driver.get("https://www.amazon.in/");
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
				driver.findElement(By.id("nav-search-submit-button")).click();
//		WebElement data = (WebElement) driver.findElements(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']"));
//		//System.out.println(data);
//
//		for(WebElement data)
//		{
//			System.out.println(data1.getText());
//		}
//			WebElement datas = driver.findElement(By.linkText("ASUS VivoBook 15 (2021), 15.6-inch (39.62 cm) HD, Dual Core Intel Celeron N4020, Thin and Light Laptop (4GB RAM/256GB SSD/Integrated Graphics/Windows 11 Home/Transparent Silver/1.8 Kg), X515MA-BR011W"));
//			datas.click();
//		Thread.sleep(1000);
//		Set <String> main1 = driver.getWindowHandles();
//		Iterator<String> itr = main1.iterator();
//		while(itr.hasNext())
//		{
//			String chi = itr.next();
//			if(!main.equalsIgnoreCase(chi))
//			{
//				driver.switchTo().window(chi);
//				Thread.sleep(1000);
//			}
//		}




			// WebDriver newWindow = driver.switchTo().newWindow(WindowType.TAB);
			 driver.findElement(By.id("buy-now-button")).click();

//			WebElement data2 = 	driver.findElement(By.xpath("//*[contains(@class,'a-icon a-accordion-radio a-icon-radio-inactive')]"));
//			data2.click();
		//	
			

	}

}
