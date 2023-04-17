package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Itera {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		List<WebElement> we=driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox']//label[@class='custom-control-label']"));
		
		
		for (WebElement weq : we) {
			
			String se=weq.getAttribute("for");
			
			if(se.equals("cucumber") || (se.equals("selenium"))){
				
				
				   weq.click();
				
			}
			
		}
	
		
	}
		
		
		
	}

