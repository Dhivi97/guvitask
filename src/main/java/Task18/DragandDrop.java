package Task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	


				WebDriver driver = new ChromeDriver();
				
				driver.get("https://jqueryui.com/droppable/");
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				// switch to frame
				
				driver.switchTo().frame(0);
				
				
				// Source element for Drag
				WebElement drag = driver.findElement(By.id("draggable"));
				
				// Destination element fot drop
				
				WebElement drop = driver.findElement(By.id("droppable"));
				
			
				
				// Perform the action
				
				Actions mouse = new Actions(driver);
				mouse.dragAndDrop(drag, drop).perform();
				
				String backGround = drop.getCssValue("background-body");
	        	System.out.println("Background color after drag and drop: " + backGround);
			
	        	//Verify that the text of the target element changes
	        	String targetText = drop.getText();
	        	if(targetText.equals("Dropped!")) {
	            		System.out.println("Drag and drop operation was successful.");
	        	}
	        	else {
	            		System.out.println("Drag and drop operation was failed.");
				
				

				}
			
				
			}

		}
	