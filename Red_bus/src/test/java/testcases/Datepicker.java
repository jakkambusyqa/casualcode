package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		driver.get("https://www.redbus.in/");	
		
	String date="10";
	String month="Feb ";
	String year="2023";
	
	driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
	
	while(true){
		String yearmonth =driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		 String arr[]=yearmonth.split(" ");
		 String mnth=arr[0];
		 String yr=arr[1];
		 
		 
		 if(mnth.equalsIgnoreCase(month) && yr.equals(year))
			 break;		 
		 
		 else
			 driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
		
	}
	
	List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
	for(WebElement dates:alldates){
		String dt=dates.getText();
		if (dt.equals(date)){
			dates.click();
			break;
			
		}
			
	}
	}

}
