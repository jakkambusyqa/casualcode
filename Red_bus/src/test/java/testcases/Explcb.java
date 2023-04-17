package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explcb {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		WebDriverWait mywait=new WebDriverWait(driver, 10); //needs to be created once and use object number of times
		
		driver.findElement(By.id("alert")).click(); //5 seconds after clicking alert to appear
		
		
		mywait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		
	}

}
