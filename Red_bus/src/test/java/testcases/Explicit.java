package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explicit {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String element = driver.getWindowHandle();
		System.out.println(element);
		
		driver.findElement(By.id("alertBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();// Alert box
		System.out.println(driver.findElement(By.id("output")));

		driver.findElement(By.id("confirmBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().dismiss();// conform box
		System.out.println(driver.findElement(By.id("output")));

		driver.findElement(By.id("promptBox")).click();

	}

}
