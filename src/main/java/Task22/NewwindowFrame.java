package Task22;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewwindowFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 // Launch the browser 
				WebDriver driver = new ChromeDriver();
			
			//load url
			driver.get("https://the-internet.herokuapp.com/windows");
			
			// Maximize the Browser
			driver.manage().window().maximize();
			
			//Implicit Wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			//locate click here and click it
			driver.findElement(By.partialLinkText("Click Here")).click();
			
			//switch to new window
			String oldWindow = driver.getWindowHandle();
			
			
			Set<String> windowHandles = driver.getWindowHandles();
			
		      List<String> windows = new ArrayList<String>(windowHandles);
					
			 driver.switchTo().window(windows.get(1));
			
			//locate xpath for new window
			WebElement newText = driver.findElement(By.xpath("//h3[contains(text(),'New Window')]"));
			Thread.sleep(3000);
			
			//verify we landed to new window
			if(newText.getText().equals("New Window")) {
				System.out.println("'New window' text is present");
			} else {
				System.out.println("'New window' text is not present");
			}
			
			//close the new window
			driver.close();
			
			//navigate to old window
			driver.switchTo().window(oldWindow);
			
			//verify old window is active
			if(driver.getWindowHandle().equals(oldWindow)) {
				System.out.println("Back to the old window");
			} else {
				System.out.println("Old window was not in active");
			}
			
			driver.quit();
		}

	}