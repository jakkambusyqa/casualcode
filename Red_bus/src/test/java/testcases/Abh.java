package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abh {

	public static void main(String[] args) {

		
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.abhibus.com/");
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));



			driver.findElement(By.xpath("//input[@id='source']")).click();
			      driver.findElement(By.xpath("//input[@id='source']")).sendKeys("hyd");
			List<org.openqa.selenium.WebElement>starting=driver.findElements(By.xpath("//*[@id='ui-id-1']//li"));
			System.out.println("size is "+starting.size());


			for (int i = 0; i < starting.size(); i++) {
				if (starting.get(i).getText().contains("Hyderabad")){
					starting.get(i).click();
					break;
				}
				

		


