package SeleniumScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task17 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

				// Launch the Browser
				WebDriver driver = new ChromeDriver();
				
				//Load a URL
				driver.navigate().to("http://www.snapdeal.com");
				
				// Maximize the Browser
						driver.manage().window().maximize();
						
						WebElement mousehover = driver.findElement(By.xpath("//div[@class='accountInner']"));
						Actions actions = new Actions(driver);
						actions.moveToElement(mousehover).perform();
						
						Thread.sleep(5000);
						
						driver.findElement(By.linkText("Your Account")).click();
						Thread.sleep(5000);
						
						
					
				// Sign-in button click
						
						driver.findElement(By.id("userName")).sendKeys("7598001992");
						
								
				// Login button click		
						driver.findElement(By.id("checkUser")).click();
						
						Thread.sleep(20000);
						
				
				//OTP button Click
						driver.findElement(By.id("loginUsingOtp")).click();
						
		       
						Thread.sleep(3000);
						
			

				WebElement Accountname = driver.findElement(By.cssSelector("span.accountUserName"));
				System.out.println(Accountname.getText());
				
				
				
			
			
				
				
	
		
	
		
		
	}
	}
	


