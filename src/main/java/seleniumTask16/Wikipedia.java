package seleniumTask16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 // Launch the browser 
	      WebDriver driver = new ChromeDriver();
	
	
	        //Load a URL
	       driver.navigate().to("https://www.wikipedia.org/");
	
	        // Maximize the Browser
			driver.manage().window().maximize();
			
			
			//Implicit Wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			
			 // Find the Search Box
			driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence",Keys.ENTER);
			
			//Click the History
			//driver.findElement(By.name("search")).sendKeys("History",Keys.ENTER);
			
		     driver.findElement(By.linkText("History")).click();

			
			 //Get the Title,  and Print in console
			String pageTitle = driver.getTitle();
			System.out.println("The Title of the Page is " + pageTitle);
	}

}
