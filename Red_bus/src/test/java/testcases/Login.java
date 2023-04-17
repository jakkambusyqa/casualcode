package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws Throwable {
ChromeDriver driver= new ChromeDriver();
driver.manage().window().maximize();





		ChromeDriver driver1 = new ChromeDriver();
		
		driver1.manage().deleteAllCookies();
		
		driver1.manage().window().maximize();
		
		driver1.get("https://forms.gle/ad5koKL5xuS8B6Qc6");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div[1]/div[1]")).click();
	
		driver1.findElement(By.xpath("//input[@aria-describedby='i6 i7']")).sendKeys("J Sai Ram");
		
		driver1.findElement(By.xpath("//input[@aria-describedby='i10 i11']")).sendKeys("MT -0554");
	
	
	}

}
