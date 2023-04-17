package testcases;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locations {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("hyd");
		
	List<WebElement>city=driver.findElements(By.tagName("li"));
		
	System.out.println("the size of list is"+city.size());
	
	
	for(int s=0;s<=city.size();s++){
		
	    city.get(s).getText().contains("Hyderabad");
	    city.get(s).click();
	    
	}
	
	}

}
