package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhg {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement abhi=driver.findElement(By.id("source"));
		abhi.sendKeys("war");
    List<WebElement>froms=driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']//li"));
    System.out.println(froms.size());

  
	
		for (int i = 0; i <= froms.size(); i++) {
			if(froms.get(i).getText().equals("Warangal")){
	         froms.get(i).click();	
			break;
			}
				
		}
		WebElement dest=driver.findElement(By.id("destination"));
		dest.sendKeys("banga");
			
		List<WebElement>ban=driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']//li"));		
        System.out.println(ban.size());
        
        
        for (int k = 0; k <= ban.size(); k++) {
		if(ban.get(k).getText().equals("Bangalore")){
		ban.get(k).click();
		break;
				
			}					        	  
          }
		}
}
