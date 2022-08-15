package First_Test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Assert.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Timeouts;

import java.util.List;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_First {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions optionsBeta = new ChromeOptions();
		optionsBeta.setBinary("C:\\Program Files\\Google\\Chrome Beta\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver" , "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(optionsBeta);
		
		
		WebDriverManager.chromedriver().setup();
		
				
	    WebDriverWait waits=new WebDriverWait (driver, Duration.ofSeconds(10));
		  

	
		driver.get("https://www.ounass.ae/");
		
		
		
		driver.manage().window().maximize();
		
	 
		waits.until(ExpectedConditions.elementToBeClickable(By.id("wzrk-cancel")));
		//waits.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#wzrk-cancel")));
	    driver.findElement(By.id("wzrk-cancel")).click();
	               
	               
	             
			 //    driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
	               waits.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href*='/men']")));
	               driver.findElement(By.cssSelector("a[href*='/men']")).click();
	               
	           
	            JavascriptExecutor Js1 = (JavascriptExecutor) driver;
	   	      	Js1.executeScript("window.scrollBy(0,2000)"); 
	         
	   	      	
	   	  
	   	     waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='PromoStrip col-md-3'][2]//div[@class='Banner-wrapper']/img")));
	   	
	   	     driver.findElement(By.xpath("//div[@class='PromoStrip col-md-3'][2]//div[@class='Banner-wrapper']/img")).click();
	         
	   	    
	   
	   	   waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='PLP-productList PLP-productList--3']//child::div[@class='Product-contents']/a"))); 
	   	   driver.findElement(By.xpath("//div[@class='PLP-productList PLP-productList--3']//child::div[@class='Product-contents']/a")).click();
	   	  
	   	     
	   	    //waits.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[title='Blue']")));
	   	    
	   	     
	   	   //driver.findElement(By.cssSelector("button[title='Blue']")).click();
	   	
	      
	       waits.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='Select-control']")));  
	       driver.findElement(By.xpath("//div[@class='Select-control']")).click();
	       driver.findElement(By.xpath("//*[text()='50']")).click();
	       waits.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-cy^='addToBagButton']")));  
	      
	       // Saving text in a string , text is of the product being selected before adding it to bag
	       String texts=driver.findElement(By.xpath("//div[@class='Brief']/h1")).getText();
	       // System.out.println("the text of select product is"+" " +texts);
	       driver.findElement(By.cssSelector("[data-cy^='addToBagButton']")).click();
	       
	       Js1.executeScript("window.scrollBy(0,1000)");
	       waits.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='LoadingOverlay']")));
	       waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='Swiper swiper-container swiper-container-initialized swiper-container-horizontal']/child::div[1]/child::div[1]/child::div/a")));
	       driver.findElement(By.xpath("//div[@class='Swiper swiper-container swiper-container-initialized swiper-container-horizontal']/child::div[1]/child::div[1]/child::div/a")).click();
	       
	      // waits.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".Select-placeholder"))); 
	       waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='size-code-select']")));
	       //driver.findElement(By.xpath("//div[@class='Select-placeholder']")).click();
	       driver.findElement(By.xpath("//div[@id='size-code-select']")).click();
	       driver.findElement(By.xpath("//*[text()='48']")).click(); 
	       
	       //waits.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-cy^='addToBagButton']"))); 
	       
	       waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='PDPDesktop-actions']/button")));
	       driver.findElement(By.xpath("//div[@class='PDPDesktop-actions']/button")).click();
	       
	       //driver.findElement(By.cssSelector("[data-cy^='addToBagButton']")).click();
	   
	
	
	  		waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='GO TO BAG']")));
	  		
	  		
	    
	  		
	  		// This text is being saved into string , the text is of the product shown in popup window once we add product into the bag  
	  	    //String first=driver.findElement(By.xpath("//div[@class='MiniCart-items']/child::div[@class='CartItem MiniCartPopup is-separate'][1]/child::div[@class='CartItem-content']/child::div[2][@class='CartItem-info']/h4")).getText();
	  
		    
		    
		   //List<WebElement> elements = driver.findElements(By.xpath("//div[@class='CartItem MiniCartPopup is-separate']"));
		   
		   // This is number of item being stored in bag saved in string on add to bag page  
		  //String st= driver.findElement(By.xpath("//h4[@class='CartItem-name']/a")).getText();
		  
		   
		   
		   
		    // Its printing number of different products being added into bag
		   // System.out.println(elements.size());
		 
		  
		    
		      // Click on GO To Bag
		      //waited.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='LoadingOverlay']")));
	  		  WebDriverWait  waited = new WebDriverWait(driver, Duration.ofSeconds(10));
		      waited.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='Tooltip-content']//child::a[text()='GO TO BAG']")));
		      waited.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Tooltip-content']//child::a[text()='GO TO BAG']")));
		      waited.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='Tooltip-content']//child::a[text()='GO TO BAG']")));
		      driver.findElement(By.xpath("//div[@class='Tooltip-content']//child::a[text()='GO TO BAG']")).click();
		     
		    
           
		     
		  
		     waits.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='CartTotal-secureCheckout'] span")));
		     // This is number of item being stored in bag saved in string on the Secure Check out page  
		    // String bag=driver.findElement(By.cssSelector("h4[class='CartItem-name'] a")).getText();
			 // Number of items being saved on two different pages are being compared
		    // Assert.assertEquals(bag,st);
			 
			 
		    
			 
			 // Text being saved in string , this text is of product show on secure checkout page 
			 String text2=driver.findElement(By.xpath("//div[@class='Cart-leftSide']//child::div[@class='CartItem Big is-separate']//child::div[@class='CartItem-info']/h4")).getText();
			 //System.out.println("print the product text" +" "+ text2);
			 
			 
			 //Both Assert function are comparing text being saved of products , on two different pages , 
			 //if both string values are not same then it returns with error and execution is stop , or else if both string are same then there is no stopping in execution and script runs accordinally 
			 Assert.assertEquals(text2, texts);
			// Assert.assertEquals(text2, first);
			 driver.findElement(By.cssSelector("button[class='CartTotal-secureCheckout'] span")).click();
			    
	   
	   
	       
		     waits.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Map-enterAddressManuallyButton")));
		     driver.findElement(By.cssSelector(".Map-enterAddressManuallyButton")).click();
	       
	     
	  
	       
	       waits.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='LoadingOverlay']")));
	       
	       waits.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='react-select-regionId--value'] div[class='Select-value']")));
	       waits.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='LoadingOverlay']")));
	       waits.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[id='react-select-regionId--value'] div[class='Select-value']")));
	       driver.findElement(By.cssSelector("div[id='react-select-regionId--value'] div[class='Select-value']")).click();
	       
	   
	       
	       
	       driver.findElement(By.xpath("//*[text()='Ajman']")).click();
	       
	      
	       
	       driver.findElement(By.cssSelector("input[placeholder='e.g. Business Bay']")).sendKeys("North Area");
	       
	      
	       
	       driver.findElement(By.cssSelector("#street")).sendKeys("Front Street");
	       
	      
	       
	       driver.findElement(By.cssSelector("#additionalInformation")).sendKeys("Villa No.6");
	       
	       
	       
	       driver.findElement(By.cssSelector("#firstName")).sendKeys("John James");
	       
	       
	       
	       driver.findElement(By.cssSelector("#lastName")).sendKeys("James");
	       
	       
	       
	       driver.findElement(By.cssSelector("#email")).sendKeys("james@gmail.com");
	       
	       Js1.executeScript("window.scrollBy(0,2000)"); 
	       
	      // waits.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='LoadingOverlay']")));
	       waits.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='react-select-mobilePrefix--value'] div[class='Select-value']")));
	       waits.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='LoadingOverlay']")));
	       waits.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[id='react-select-mobilePrefix--value'] div[class='Select-value']")));
	       driver.findElement(By.cssSelector("div[id='react-select-mobilePrefix--value'] div[class='Select-value']")).click();
	       
	       
	       
	       driver.findElement(By.xpath("//*[text()='+971']")).click();
	       
	      
	       
	       driver.findElement(By.cssSelector("#mobileNumber")).sendKeys("51026980");
	       
	   
	       
	       driver.findElement(By.cssSelector("label[for='shippingMethodRadio_105_flatrate_nextday::flatrate_nextday'] span[class='ShippingMethodSelection-shippingMethodText']")).click();
	       
	   
	       
	       driver.findElement(By.cssSelector("label[for='packagingOptionRadio2'] span[class='PackagingOptionSelection-packagingOptionTitle']")).click();
	       
	    
	       
	       driver.findElement(By.cssSelector("button[type='submit']")).click();     
	       
	       
		driver.close();   
		
	}
	
	

}
