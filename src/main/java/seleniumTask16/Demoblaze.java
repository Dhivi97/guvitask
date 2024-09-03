package seleniumTask16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  // Launch the browser 
	       WebDriver driver = new ChromeDriver();
	
	
	       //Load a URL
	       driver.navigate().to("https://www.demoblaze.com/");
	
	       // Maximize the Browser
			driver.manage().window().maximize();
			
		   //Get the Title, and Print in console
			String pageTitle = driver.getTitle();
			System.out.println("The Title of the Page is " + pageTitle);
			
		   //Get the Title, Validate and Print in console
			
			String expectedTitle = "STORE";
			String actualTitle =driver.getTitle();
			
			if(expectedTitle.equalsIgnoreCase(actualTitle))  {
				System.out.println("Page Landed on Correct Website");
				
			}else {
				System.out.println("Page not Landed on Correct Website");
			}

	}

}
