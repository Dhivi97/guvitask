package SeleniumScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task17 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Load a URL
		driver.navigate().to("http://www.snapdeal.com");
		
		// Maximize the Browser
				driver.manage().window().maximize();
				
				
				//Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				
			
		// Sign-in button click
				
				driver.findElement(By.xpath("//span[contains(@class,'accountUserName col-xs-12 reset-padding')]")).click();
				
				Thread.sleep(15000);		
		// Login button click		
				driver.findElement(By.xpath("//span[contains(@class,'accountBtn btn rippleWhite')]")).click();
				
				Thread.sleep(6000);
				
				driver.switchTo().frame("loginIframe");
				
// Enter Phone number		
				driver.findElement(By.id("userName")).sendKeys("9385909297");
				
				
		// click Continue
            	driver.findElement(By.xpath("//button[text()='continue']")).click();
				
            	Thread.sleep(20000);
				
		//OTP button Click
				driver.findElement(By.id("loginUsingOtp")).click();
				
				
				//String username = driver.findElement(By.xpath("//span[contains(@class,'accountUserName')]")).getText();
				
				//System.out.println("The user name is: " + username);
				
			
				
	
		
	
		
		
	}
	

}
