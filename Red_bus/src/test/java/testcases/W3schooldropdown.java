package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3schooldropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/css/css_dropdowns.asp");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> options = driver
				.findElements(By.xpath("//div[@class='w3-third']//div[@class='dropdown-content']/a"));

		System.out.println(options.size());

		for (WebElement option : options) {

			System.out.println(option.getText());

			// if(option.getText().equals("Link 2"))
			// option.click();

		}
	}

}
