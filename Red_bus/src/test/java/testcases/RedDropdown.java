package testcases;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedDropdown {

	public static void main(String[] args) {

	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	String date="31";
	String month="dec";
	String year="2022";
	
driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
while(true){
	
String monthyear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();

String arr[]=monthyear.split(" ");

String mth=arr[0];
String yer=arr[1];

if(mth.equalsIgnoreCase(month)&& yer.equals(year))
break;
else
	(driver.findElement(By.xpath("//button[normalize-space()='>']"))).click();
}
List<WebElement> book=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));

for(WebElement days:book){
	
	String day=days.getText();
	if(day.equals(date))
days.click();
	break;
	
}
}	
	

}
