package testcases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitPrac {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://testproject.io/");

		String parent=driver.getWindowHandle();
		
		WebDriverWait mywait = new WebDriverWait(driver, 10);

		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
	

		Set<String> handle = driver.getWindowHandles();
		
		for(String handles:handle){
			
			if(!parent.equals(handles))
				
			driver.switchTo().window(handles);	
			
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
				
			driver.findElement(By.id("username")).sendKeys("jakkam");	
		}
		
		
		
		
		
		
		
		
		
		
		
//		
//		Iterator<String> itr=handle.iterator();
//		
//		String parent=itr.next();
//        String child=itr.next();
//        
//        System.out.println(parent);
//        
//        System.out.println(child);
//        
//        driver.switchTo().window(child);
//        
//		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
//
//		driver.findElement(By.id("username")).sendKeys("jakkamsairam3@gmail.com");

	}

}
