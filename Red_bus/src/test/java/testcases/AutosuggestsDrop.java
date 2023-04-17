package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestsDrop {

	public static void main(String[] args) throws Throwable {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		
		WebElement search=driver.findElement(By.name("q"));
		
		search.sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> words=driver.findElements(By.xpath("//div[@class='wM6W7d']//span"));
		
		System.out.println(words.size());
		
	for (WebElement option: words) {
		
	if(option.getText().contains("selenium download")){
		
		option.click();
		break;
	}
	
	
	}
	
	
	
	
	
	}

	
	
	
}
