package testcases;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IlovePdf {

	public static void main(String[] args) throws AWTException, Throwable  {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/");
	
		Actions ac=new Actions(driver);
		
	ac.moveToElement(driver.findElement(By.xpath("//*[text()='Convert PDF']"))).build().perform();
		driver.findElement(By.xpath("//ul[contains(@class,'dropdown-menu mega menu-full menu-full--convert')]//ul//li//a[normalize-space()='WORD to PDF']")).click();
	
	driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
	
Robot rb=new Robot();
rb.delay(1000);
		
StringSelection ss=new StringSelection("D:\\Graduation Project\\beam design j.docx");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

rb.keyPress(KeyEvent.VK_CONTROL);
rb.keyPress(KeyEvent.VK_V);

rb.keyRelease(KeyEvent.VK_CONTROL);
rb.keyRelease(KeyEvent.VK_V);

rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);

Thread.sleep(2000);
WebElement gov=driver.findElement(By.xpath("//button[@id='processTask']"));
gov.click();
driver.findElement(By.xpath("//a[@class='downloader__btn active']")).click();
	}

}
