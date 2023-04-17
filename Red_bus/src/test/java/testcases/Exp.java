package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exp {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		

		WebDriverWait mywait=new WebDriverWait(driver, 12);
		
		WebElement alert=driver.findElement(By.id("populate-text"));
		alert.click();
		
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("display-other-button")));
		
		driver.findElement(By.id("display-other-button")).click();
		
		
//		
//		
//		WebElement ele=mywait.until(ExpectedConditions.elementToBeClickable(By.id("populate-text")));
//        ele.click(); 		
//		
//		driver.findElement(By.id("display-other-button")).click();
//		
	}

}
