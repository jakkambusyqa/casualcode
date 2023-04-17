package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();

		driver.get("https://www.google.co.in/");





Thread.sleep(1000);
driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[2]/a")).click();
driver.get("https://docs.google.com/forms/d/e/1FAIpQLSeBJ4Eyghrx8Z5GYnM3KGh9O3fn1eVkdA2PiHRaAvIIXOY7Fw/viewform");
driver.findElement(By.xpath("//div[@class='MocG8c HZ3kWc mhLiyf LMgvRb DEh1R KKjvXb']")).click();
	}

}
 