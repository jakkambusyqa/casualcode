package testcases;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upl {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://empirehome.myprojectsonline.co.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("emailid")).sendKeys("tmpreddy2015@gmail.com");
		driver.findElement(By.xpath("//input[@id='pword']")).sendKeys("Rams#12345");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='fa fa-houzz']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/Inventory/InventoryData']")).click();
		WebElement ele = driver.findElement(By.xpath("//div[@class='form-group']//input[@id='RecievedDate']"));
		ele.sendKeys("19-02-2023");
		
		WebElement file = driver.findElement(By.name("ProductMainImageUploaded"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", file);
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("D:\\jakkam sairam\\Downloads\\pic.webp");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	
	}
}
