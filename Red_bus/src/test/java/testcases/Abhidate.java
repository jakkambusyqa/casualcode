package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhidate {

	public static void main(String[] args) {

ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.abhibus.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String date="26";
		String month="April";
		String year="2023";
	
		String montyear = month+" "+year;
		
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		
		String text = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]")).getText();
		
		System.out.println(text);
		
	while(text.equals(montyear)){
		driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all ui-state-hover ui-datepicker-next-hover']")).click();
	}
	}

}
