package Task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviSignup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		   //Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		
		   //Load a URL
	       driver.navigate().to("https://www.guvi.in/");
	
	       // Maximize the Browser
			driver.manage().window().maximize();
			
			//Implicit Wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			//Click signup Button
			driver.findElement(By.partialLinkText("Sign up")).click();
			
			//Signup Credentials
			driver.findElement(By.id("name")).sendKeys("Dhivyabharathi P");
			
			driver.findElement(By.id("email")).sendKeys("dhivyabhri@gmail.com");
			
			
			driver.findElement(By.id("password")).sendKeys("Dd@guvi97");
			
			
			driver.findElement(By.xpath("//input[contains(@class,'form-control countrycode-left')]")).sendKeys("9385909297");
			
			Thread.sleep(3000);
			
			// Click signup
			driver.findElement(By.tagName("a")).click();
			
			//Validation
			
			String title = "GUVI | Learn to code in your native language";
	        if(driver.getTitle().equals(title)) {
	            System.out.println("User register successfully");
	        }
	        else {
	            System.out.println("User register failed");
	        }
	

	       

				driver.findElement(By.id("login-btn")).click();
				
				driver.findElement(By.id("email")).sendKeys("dhivyabhri@gmail.com");
				
				driver.findElement(By.id("password")).sendKeys("Dd@guvi97");
				
				
				driver.findElement(By.id("login-btn")).click();
				
				
				 String titleLogin =driver.getCurrentUrl();
			        if(driver.getCurrentUrl().equals(titleLogin)) {
			            System.out.println("User login successfully");
			        }
			        else {
			            System.out.println("User login failed");
			            
			
			        }
			        
			        driver.quit();
				}
}
			
					
					
				
					
				
	

	

