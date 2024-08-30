package Task19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  // Launch the browser 
	       WebDriver driver = new ChromeDriver();
	
	
	       //Load a URL
	       driver.navigate().to("https://www.guvi.in/register");
	
	       // Maximize the Browser
			driver.manage().window().maximize();
			
			//Implicit Wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			
			                    //*name*
		
			//ID Locator for name
			driver.findElement(By.id("name")).sendKeys("Dhivyabharathi");
			
			// Class Locator for name
			//driver.findElement(By.className("form-control")).sendKeys("Dhivyabharathi");
			
			// Css class Locator for name
			//driver.findElement(By.cssSelector("input.form-control")).sendKeys("Dhivyabharathi");
			
			// Css ID Locator for name
			//driver.findElement(By.cssSelector("input#name")).sendKeys("Dhivyabharathi");
			
			//Tagname for name
			//driver.findElement(By.tagName("input")).sendKeys("DD");
			
			//Relative Xpath 
			//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("DD");
			
			//Index Xpath
			//driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys("DD");
			
			
			
			                 // *EMAIL*
			
			
			//ID Locator for Email
			driver.findElement(By.id("email")).sendKeys("ramyaa27eeee@gmail.com");
			
			//Css Id Locator for Email
			//driver.findElement(By.cssSelector("input#email")).sendKeys("ramyaa27eeee@gmail.com");
			
			// Relative Xpath
			//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ramyaa27eeee@gmail.com");
			
			// Index xpath
			//driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("ramyaa27eeee@gmail.com");
			
		
			
//As Both name and Email has same Class attribute "form-control", so unable to get the input. if i run input,it automatically entering in the name box not in email section.
			//class Locator for Email
			//driver.findElement(By.className("form-control")).sendKeys("ramyaa27eeee@gmail.com");
			
			//Css class Locator for Email
			//driver.findElement(By.cssSelector("input.form-control")).sendKeys("ramyaa27eeee@gmail.com");
			
			
			
			                   //*Password*
			
			//ID Locator for Password
			driver.findElement(By.id("password")).sendKeys("123456dd");
			
			//Xpath Class Locator for Password
			//driver.findElement(By.xpath("//input[contains(@class,'form-control password-err')]")).sendKeys("123456dd");
			
			//CSS ID for password
			//driver.findElement(By.cssSelector("input#password")).sendKeys("123456dd");
			
			//// Relative Xpath
			//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345dd");
			
			//Index xpath
			//driver.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("123456dd");
			
			
			
			
			               //*Mobile Number*
			
			//ID Locator for Mobile Number
			driver.findElement(By.id("mobileNumber")).sendKeys("9385909297");
			
			
			//Xpath Class Locator for Mobile Number
			//driver.findElement(By.xpath("//input[contains(@class,'form-control countrycode-left')]")).sendKeys("9385909297");
			
		
			
			//CSS ID for Mobile Number
			//driver.findElement(By.cssSelector("input#mobileNumber")).sendKeys("9385909297");
			
			
			
			
			// Relative Xpath for Mobile Number
			//driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9385909297");
			
			
			
			// Index Xpath for Mobile Number
			//driver.findElement(By.xpath("(//input[@id='mobileNumber'])[1]")).sendKeys("9385909297");
			
			
			
			
			
			                    //*Signup*
	

			//ID Locator for Signup 
			driver.findElement(By.id("signup-btn")).click();
			
			
			
			//CSS ID for Signup
			//driver.findElement(By.cssSelector("input#signup-btn")).click();
			
			
			
			
			// Relative Xpath for Signup
			//driver.findElement(By.xpath("//a[@id='signup-btn']")).click();
			
			
			
			// Index Xpath for Signup
			//driver.findElement(By.xpath("(//a[@id='signup-btn'])[1]")).click();
			
			
			
			//Tagname for Signup
			//driver.findElement(By.tagName("a")).click();
			
			
	}

}
