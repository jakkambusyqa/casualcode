package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.findElement(By.xpath("//input[@id='male']")).click();
		driver.findElement(By.id("name")).sendKeys("jakkam sairam");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jakkamsairam333@gmail.com");
		// driver.findElement(By.xpath("//input[@type='email']")
		driver.findElement(By.id("phone")).sendKeys("1111111111");
		driver.findElement(By.id("password")).sendKeys("Sairam@12345");
		driver.findElement(By.id("address")).sendKeys("hyderabad");
		driver.findElement(By.xpath("//button[@name='submit']"));
		WebElement boxes = driver.findElement(By.xpath("//select[@class='custom-select']"));
		boxes.click();
		Select sel = new Select(boxes);
		sel.selectByVisibleText("Italy");
		driver.findElement(By.xpath("//label[@for='1year']")).click();

		List<WebElement> auto = driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox']//label"));
		
		System.out.println("size of testing" + auto.size());

		for (int i = 0; i < auto.size() - 1; i++) {
			auto.get(i).click();
		}

		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox' and contains (@id,'day')]"));
		System.out.println(checkbox.size());

		for (int i = checkbox.size() - 3; i < checkbox.size(); i++) {
			checkbox.get(i).click();

		}

		WebElement upload = driver.findElement(By.xpath("//input[@id='inputGroupFile02']"));
		upload.click();

	}
}
