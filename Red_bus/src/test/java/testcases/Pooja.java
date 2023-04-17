package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pooja {

	public static void main(String[] args) throws Throwable {

				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
				driver.get("http://poojastore.marolix.com/");
				driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
				driver.findElement(By.xpath("(//a[text()=\"Log In\"])[1]")).click();
				
				driver.findElement(By.name("emailid")).sendKeys("pooja132@gmail.com");
				driver.findElement(By.xpath("//input[@name=\"pword\"]")).sendKeys("1234");
				
				driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
				
				Thread.sleep(5000);
				
				
				WebElement pro=driver.findElement(By.linkText("Product"));
				pro.click();
				
	}}	
			
		




