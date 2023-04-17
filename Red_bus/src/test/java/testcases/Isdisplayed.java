package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayed {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://empirehome.myprojectsonline.co.in/");
		driver.manage().window().maximize();
		
		 WebElement logo=driver.findElement(By.xpath("//img[@src='/WebApp/assets/dist/img/logo.png']"));
		
		System.out.println(logo.isDisplayed());
		
		
	}

}
