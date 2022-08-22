package Org.BasicPrograme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenGoogleEx {

	public static void main(String[] args) {
		System.out.println("*** Programe Start ***");
		BaseUtility bu = new BaseUtility();
		String url = "https://www.google.co.in/";
		bu.StartUp("ch", url);
		System.out.println("*** Programe End ***");


	}



}
