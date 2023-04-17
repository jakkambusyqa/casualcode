package testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Roboo {

	public static void main(String[] args) throws Throwable {

		WebDriver driver=new ChromeDriver();
		
	    driver.manage().window().maximize();
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='Select PDF file']")).click();
		
		
		
		Robot rb=new Robot();
		
		rb.delay(2000);
		
		StringSelection st=new StringSelection("D:\\projects\\Alkapur.knr.pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st,null );
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_CONTROL);
		
		rb.keyPress(KeyEvent.VK_ENTER);	
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
