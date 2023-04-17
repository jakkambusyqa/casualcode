package testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class California {

	public static void main(String args[]){
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(0);
		WebElement state=driver.findElement(By.name("California"));
		state.click();
		Actions ac=new Actions(driver);
		ac.moveToElement(state).click().perform();
		
	}
	
	
}
