package GenericMethodDemo;

import org.openqa.selenium.WebDriver;

public class WebElement {

	public static void main(String[] args) {

		GenricMethod gm = new GenricMethod();
		gm.invoke("https://demoqa.com/text-box");

		WebDriver username = gm.id("//input[@id='userName']");
		
		
		


	}

}
