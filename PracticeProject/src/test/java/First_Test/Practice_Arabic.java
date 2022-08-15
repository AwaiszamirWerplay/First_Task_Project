package First_Test;

import static org.testng.Assert.expectThrows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Timeouts;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice_Arabic {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		ChromeOptions optionsBeta = new ChromeOptions();
		optionsBeta.setBinary("C:\\Program Files\\Google\\Chrome Beta\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver" , "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(optionsBeta);
		
		
		WebDriverManager.chromedriver().setup();
		
				
	    WebDriverWait waits=new WebDriverWait (driver, Duration.ofSeconds(10));
		
		
		JavascriptExecutor Js1 = (JavascriptExecutor) driver;
		driver.get("https://ar.ounass.ae/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//Thread.sleep(5000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
	               //  String originalWindow=	driver.getWindowHandle();
	            // Thread.sleep(2000);
		
	             driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
	             
	           
	             
	          driver.findElement(By.xpath("//a[contains(text(),'الرجال')]")).click();
	               
	          Js1.executeScript("window.scrollBy(0,2000)"); 
	          waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='PromoStrip col-md-3'][2]//div[@class='Banner-wrapper']/img")));
		 	   	
		   	     driver.findElement(By.xpath("//div[@class='PromoStrip col-md-3'][2]//div[@class='Banner-wrapper']/img")).click();
	         
	   	      	
	      

		   	  waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='PLP-productList PLP-productList--3']//child::div[@class='Product-contents']/a"))); 
		   	  driver.findElement(By.xpath("//div[@class='PLP-productList PLP-productList--3']//child::div[@class='Product-contents']/a")).click();
	   	     
	   	     
	   	   waits.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".Select-placeholder")));  
	       driver.findElement(By.xpath("//div[@class='Select-placeholder']")).click();
	       driver.findElement(By.xpath("//*[text()='50']")).click();
	       waits.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".AddToBag"))); 
	       String texts=driver.findElement(By.xpath("//div[@class='Brief']/h1")).getText();
	       // System.out.println("the text of select product is"+" " +texts);
	       driver.findElement(By.cssSelector(".AddToBag")).click();
	       
	      
	       
	       Js1.executeScript("window.scrollBy(0,1000)");
	       
	       
	      // waits.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='LoadingOverlay']")));
	       waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='Product-contents'][1]/a")));
	       driver.findElement(By.xpath("//div[@class='Product-contents'][1]/a")).click(); 
	       
	      // waits.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='LoadingOverlay']")));
	       
	       
	       waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='size-code-select']")));
	      
	       driver.findElement(By.xpath("//div[@id='size-code-select']")).click();
	       driver.findElement(By.xpath("//*[text()='48']")).click(); 
	       
	       //waits.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-cy^='addToBagButton']"))); 
	       
	       waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='PDPDesktop-actions']/button")));
	       driver.findElement(By.xpath("//div[@class='PDPDesktop-actions']/button")).click();
	       
	       
	       
		      waits.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='Tooltip-content']//child::a[text()='عرض الحقيبة']")));
		      waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Tooltip-content']//child::a[text()='عرض الحقيبة']")));
		      waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='Tooltip-content']//child::a[text()='عرض الحقيبة']")));
		      driver.findElement(By.xpath("//div[@class='Tooltip-content']//child::a[text()='عرض الحقيبة']")).click();
	       
	       
	       
	         
	      String text2=driver.findElement(By.xpath("//div[@class='Cart-leftSide']//child::div[@class='CartItem Big is-separate']//child::div[@class='CartItem-info']/h4")).getText();
	      Assert.assertEquals(text2, texts);
	      waits.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".CartTotal-secureCheckout")));
	      driver.findElement(By.cssSelector(".CartTotal-secureCheckout")).click();
	       
	  
	       
	       driver.findElement(By.cssSelector(".Map-enterAddressManuallyButton")).click();
	       
	    
	       
	       //driver.findElement(By.xpath("//label[@for='regionId']//div[@class='Select Dropdown has-value is-searchable Select--single']")).click();
	       
	       waits.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='LoadingOverlay']")));
	       
	       waits.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='Select Dropdown has-value is-searchable Select--single']")));
	       // waits.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='LoadingOverlay']")));
	       waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='Select Dropdown has-value is-searchable Select--single']")));
	       driver.findElement(By.xpath("//div[@class='Select Dropdown has-value is-searchable Select--single']")).click();
	      
	       
	       
	      
	       
	       
	       driver.findElement(By.xpath("//*[text()='عجمان']")).click();
	      // waits.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='LoadingOverlay']")));
	      
	       
	       driver.findElement(By.cssSelector("input[placeholder='مثال: الخليج التجاري']")).sendKeys("المنطقة الشمالية");
	       
	     
	       
	       driver.findElement(By.cssSelector("#street")).sendKeys("الشارع الأمامي");
	       
	              
	       
	       driver.findElement(By.cssSelector("#additionalInformation")).sendKeys("فيلا رقم 6");
	       
	      
	       
	       driver.findElement(By.cssSelector("#firstName")).sendKeys("محمد احمد");
	       
	       
	       
	       driver.findElement(By.cssSelector("#lastName")).sendKeys("محمد");
	       
	       
	       
	       driver.findElement(By.cssSelector("#email")).sendKeys("james@gmail.com");
	       
	       
	       Js1.executeScript("window.scrollBy(0,2000)"); 
	       // driver.findElement(By.xpath("//div[@id='react-select-mobilePrefix--value']//div[@class='Select-value']")).click();
	       waits.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='react-select-mobilePrefix--value'] div[class='Select-value']")));
	     
	       waits.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[id='react-select-mobilePrefix--value'] div[class='Select-value']")));
	       waits.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='LoadingOverlay']")));
	       driver.findElement(By.cssSelector("div[id='react-select-mobilePrefix--value'] div[class='Select-value']")).click();
	       
	       
	       driver.findElement(By.xpath("//*[text()='+971']")).click();
	       
	      
	       
	       driver.findElement(By.cssSelector("#mobileNumber")).sendKeys("51026980");
	       
	       
	       
           driver.findElement(By.cssSelector("label[for='shippingMethodRadio_105_flatrate_nextday::flatrate_nextday'] span[class='ShippingMethodSelection-shippingMethodText']")).click();
	       
	   
	       
	       driver.findElement(By.cssSelector("label[for='packagingOptionRadio2'] span[class='PackagingOptionSelection-packagingOptionTitle']")).click();
	       
	    
	       
	    
	       
	       
	       
	       driver.findElement(By.cssSelector("button[type='submit']")).click();   
	       
	       
	      
	    
	    
	    
		
		//driver.close();
		
		
		
	}
	
	

}
