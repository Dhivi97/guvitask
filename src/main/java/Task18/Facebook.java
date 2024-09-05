package Task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Load a URL
		driver.navigate().to("http://www.Facebook.com");
		
		//verify the Homepage website in Console
		
		String expectedText="Facebook";
		String actualText = driver.getTitle();
		
	if(expectedText.equalsIgnoreCase(actualText)) {
		System.out.println("Hompage found");
	} else {
		System.out.println("Home page not found");
	
    
		}
		// Maximize the Browser
				driver.manage().window().maximize();
				
				
		//Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
	
				
		// Login Functionalities
				driver.findElement(By.partialLinkText("Create new account")).click();
				
		// Enter the Firstname		
				driver.findElement(By.name("firstname")).sendKeys("Test");
				
		// Enter the Lastname
				driver.findElement(By.name("lastname")).sendKeys("User");
				
		// Enter the Number		
				driver.findElement(By.name("reg_email__")).sendKeys("9385909297");
				
		// Enter the Password
				driver.findElement(By.id("password_step_input")).sendKeys("Fb1234");
				
       // Enter the Date in D.O.B		
				WebElement day = driver.findElement(By.id("day"));
				Select date = new Select(day);
				date.selectByValue("11");
				
							
	   //Enter the Month in D.O.B
				WebElement month = driver.findElement(By.id("month"));
				Select mnth = new Select(month);
				mnth.selectByValue("5");
				
	 //Enter the Year in D.O.B
				WebElement Year = driver.findElement(By.id("year"));
				Select yr = new Select(Year);
				yr.selectByValue("1985");
				
	// Enter the Gender 			
				driver.findElement(By.className("_58mt")).click();
				
	// Click Continue Button			
				driver.findElement(By.name("websubmit")).click();
				
	// Verift signin in Console
				
				String expectedresult = "Signedin Successfully";
				String actualresult =driver.getCurrentUrl();
				
				if(expectedresult.equalsIgnoreCase(actualresult))  {
					System.out.println("Successfully Registered");
					
				}else {
					System.out.println("Not Valid Username");
				}
}

}


		

