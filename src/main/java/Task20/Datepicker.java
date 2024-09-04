package Task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		
		String expectedDay ="22";
		String expectedMonth = "October 2024";
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
		
		while(true) {
			
			String actualMonth = driver.findElement(By.className("ui-datepicker-title")).getText();
			
			if(expectedMonth.equals(actualMonth)) {
				break;
			} else {
				driver.findElement(By.partialLinkText("Next")).click();
				
				
			}
		}
		driver.findElement(By.xpath("//a[text()='"+expectedDay+"']")).click();
		
	;
		
          String actualMonth = driver.findElement(By.id("datepicker")).getText();
		
		  System.out.println(expectedDay + expectedMonth);
		
		
		
	}
		
	}


