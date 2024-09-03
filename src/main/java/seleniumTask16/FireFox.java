package seleniumTask16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Launch the browser 
        WebDriver driver = new FirefoxDriver();

         // Maximize the Browser
		driver.manage().window().maximize();
		
		//Load a URL
		driver.navigate().to("http://google.com");
		
		// Get the Page URL
		String url = driver.getCurrentUrl();
				System.out.println("The current url is:"+(url));
	
		// Reload the Page
	    driver.navigate().refresh();
		
		// Close the Browser
		driver.close();
				
		
	

	}

}
