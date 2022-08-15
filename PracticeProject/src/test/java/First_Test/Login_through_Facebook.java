package First_Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Timeouts;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_through_Facebook {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://ounass.ae/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
	               //  String originalWindow=	driver.getWindowHandle();
	            // Thread.sleep(2000);
		
	             driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
	             
	            // Thread.sleep(2000);
	           driver.findElement(By.xpath("//div[contains(text(),'Account')]")).click();
	            //driver.findElement(By.xpath("//a[contains(text(),'العربيّة')]")).click();
	             
	            Thread.sleep(3000);
	
	           driver.findElement(By.xpath("//button[normalize-space()='CONTINUE WITH AMBER']")).click();
	             

                    
	           
	             
	          Thread.sleep(2000);
	             
	          driver.findElement(By.xpath("//button[@id='btnCreateAccountWithFacebook']")).click();
		
		//driver.close();
		
		
		
	}
	
	

}
