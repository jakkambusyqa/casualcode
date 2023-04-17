package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Uploadempire {

	public static void main(String[] args) throws Throwable {

		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://empirehome.myprojectsonline.co.in/");
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    
	    driver.findElement(By.name("emailid")).sendKeys("tmpreddy2015@gmail.com");
	    driver.findElement(By.name("pword")).sendKeys("Rams#12345");
	    driver.findElement(By.xpath("//button[@class='btn green_btn']")).click();
	    
	    Thread.sleep(3000);
	    WebElement mouse=driver.findElement(By.xpath("/html/body/div[3]/aside/div/span/ul/li[3]/a/i"));
	    Actions ac=new Actions(driver);
	    ac.moveToElement(mouse).build().perform();	    
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[3]/aside/div/span/ul/li[3]/ul/li[8]/a")).click();
	    
	    
	    Thread.sleep(3000);

	    WebElement file = driver.findElement(By.name("ProductMainImageUploaded"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", file);

	      
	    
//	    JavascriptExecutor js=(JavascriptExecutor)driver;
//	    js.executeScript("window.scrollBy(0,1500)");
	    

//	    WebElement image=driver.findElement(By.name("ProductMainImageUploaded"));
////	    JavascriptExecutor js=(JavascriptExecutor)driver;
//	    js.executeScript("arguments[0].click()",image);
	    	
	}

}
