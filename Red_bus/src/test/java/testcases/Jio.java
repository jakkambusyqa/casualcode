package testcases;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jio {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jio.com/mobile.html");
		driver.findElement(By.xpath("//a[@class='j-link group__link']//div[@class='j-text j-text-body-m'][normalize-space()='Prepaid']")).click();
		Dimension d=new Dimension(10,80);
		driver.manage().window().setSize(d);
		
	}

}
