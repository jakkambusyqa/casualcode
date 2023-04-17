package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class why {

	public static void main(String[] args) {

		
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.ajio.com/");
		
		driver.manage().window().maximize();
	WebElement	log=driver.findElement(By.xpath("//*[@id='appContainer']/div[1]/div/header/div[2]/a/img"));
	log.isDisplayed();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
	}

}
