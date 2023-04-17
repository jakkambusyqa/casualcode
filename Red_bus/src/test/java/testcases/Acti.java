package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acti {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		WebElement element = driver.findElement(By.xpath("(//a[@class='gb_q'])[1]"));

		Actions actions = new Actions(driver);

		actions.moveToElement(element).contextClick().perform();

		
		
	}

}
