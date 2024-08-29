package SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Load a URL
	driver.get ("https://www.google.com/");

	    // Maximize the Browser
	driver.manage().window().maximize();
	
	
       // Find the Search Box
	driver.findElement(By.id("APjFqb")).sendKeys("Selenium Browser Driver",Keys.ENTER);
	
	
	
		
	}

}
