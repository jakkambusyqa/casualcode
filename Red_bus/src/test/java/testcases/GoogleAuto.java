package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAuto {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10), arg));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement goog=driver.findElement(By.name("q"));
        goog.sendKeys("selenium");
        
        List <WebElement>list=driver.findElements(By.xpath("//li[@class='sbct']//b"));
       System.out.println ("size is"+list.size());
        
	for (WebElement options:list){
		if(options.getText().equals("selenium download")){
			options.click();
			break;
			
		}}}}
		
	
	


