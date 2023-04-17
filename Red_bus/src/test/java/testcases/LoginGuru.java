package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGuru {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://clicks.aweber.com/y/ct/?l=EaYyS&m=mqr21DGG7WFEjy9&b=ftyRAGqn86J.zqoUqwX_JA");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("UserId");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password");
driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
