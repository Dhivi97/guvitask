package Task22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Launch the browser 
				WebDriver driver = new ChromeDriver();
						
				//Load a URL
				driver.get("http://the-internet.herokuapp.com/nested_frames");
				
				 // Maximize the Browser
				driver.manage().window().maximize();
				
				//Implicit Wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				//switch to top frame
				driver.switchTo().frame("frame-top");
				
				//verify there are 3 frames
				List<WebElement> frames = driver.findElements(By.xpath("//frame"));
			        if (frames.size() == 3) {
			            System.out.println("There are three frames on the page");
			        } else {
			            System.out.println("The number of frames is not three");
			        }
			        
			        //switch to left frame
			        driver.switchTo().frame("frame-left");
			        
			        // Verify that the left frame has a text "LEFT"
			        WebElement left = driver.findElement(By.xpath("//body[contains(text(), 'LEFT')]"));
			        
			        if (left.getText().contains("LEFT")) {
			            System.out.println("Left frame has the text LEFT");
			        } else {
			            System.out.println("Left frame does not have the text LEFT");
			        }
			        
			        //switch to top frame
			        driver.switchTo().parentFrame();
			        
			        //switch to middle
			        driver.switchTo().frame("frame-middle");
			        
			        // Verify that the left frame has a text "MIDDLE"
			        WebElement middle = driver.findElement(By.xpath("//div[@id='content']"));
			        if (middle.getText().contains("MIDDLE")) {
			            System.out.println("Middle frame has the text MIDDLE");
			        } else {
			            System.out.println("Middle frame does not have the text MIDDLE");
			        }
			        
			        //switch to top frame
			        driver.switchTo().parentFrame();
			        
			        //switch to right
			        driver.switchTo().frame("frame-right");
			        
			        // Verify that the left frame has a text "MIDDLE"
			        WebElement right = driver.findElement(By.xpath("//body[contains(text(), 'RIGHT')]"));
			        if (right.getText().contains("RIGHT")) {
			            System.out.println("Right frame has the text RIGHT");
			        } else {
			            System.out.println("Right frame does not have the text Right");
			        }
			        
			        //switch to top frame
			        driver.switchTo().parentFrame();
			        
			        //swtich to default frame
			        driver.switchTo().defaultContent();
			        
			        //switch to right
			        driver.switchTo().frame("frame-bottom");
			        
			        // Verify that the left frame has a text "MIDDLE"
			        WebElement bottom = driver.findElement(By.xpath("//body[contains(text(), 'BOTTOM')]"));
			        if (bottom.getText().contains("BOTTOM")) {
			            System.out.println("Bottom frame has the text BOTTOM");
			        } else {
			            System.out.println("Bottom frame does not have the text BOTTOM");
			        }
			        
			        //switch to top frame
			        driver.switchTo().parentFrame();
			        driver.switchTo().defaultContent();
			        
			        //This page doesnot have page title so I am using pageurl
			        
			        //verify page url is frame
			        String url = "https://the-internet.herokuapp.com/nested_frames";
			        String pageUrl = driver.getCurrentUrl();
			        Thread.sleep(2000);
			        if(pageUrl.equals(url)) {
			        	System.out.println("we landed on correct page");
			        }
			        else {
			        	System.out.println("we wrongly landed. It is: " +pageUrl);
			        }
			
				
				
				
				}
	}
				
		
	


