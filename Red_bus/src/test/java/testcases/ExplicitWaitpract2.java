package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitpract2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		WebDriverWait mywait = new WebDriverWait(driver, 15);
//
//		driver.findElement(By.id("alert")).click();
//
//		mywait.until(ExpectedConditions.alertIsPresent());
//
//		driver.switchTo().alert().accept();
//
//		driver.findElement(By.id("populate-text")).click();
//
//		mywait.until(ExpectedConditions.elementToBeClickable(By.id("display-other-button")));
//		
//		driver.findElement(By.id("display-other-button")).click();
//
//		driver.findElement(By.id("enable-button")).click();
//
//		mywait.until(ExpectedConditions.elementToBeClickable(By.id("disable")));
//
//		driver.findElement(By.id("disable")).click();
//		
		
		
		
		
		WebElement check=driver.findElement(By.id("checkbox"));
		check.click();
		
				
		mywait.until(ExpectedConditions.elementToBeSelected(By.id("ch")));
				
		WebElement box=driver.findElement(By.id("ch"));
		
		System.out.println(box.isSelected());
		

	}

}
