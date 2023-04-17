package testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {

	public static void main(String[] args) throws Throwable {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	   
	    
	    
	    driver.findElement(By.name("firstname")).sendKeys("jakkam");
	    driver.findElement(By.name("lastname")).sendKeys("sairam");
	    driver.findElement(By.xpath("//input[@value='Male']")).click();
	    
	    driver.findElement(By.xpath("//input[@value='2']")).click();
	    driver.findElement(By.id("datepicker")).sendKeys("13/02/2023");
	    driver.findElement(By.xpath("//input[@value='Manual Tester']")).click();
	    driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
	    driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();
	    
	    WebElement continents=driver.findElement(By.id("continents"));    
	    Select sel=new Select(continents);
	    sel.selectByVisibleText("Asia");
	    
	    driver.findElement(By.xpath("//option[text()='Wait Commands']")).click();
	    
	    JavascriptExecutor js=driver;
	    js.executeScript("Window.ScrollBy(0,3000)");
	    
	    
	   // driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/main/div/div[1]/div/article/div/div/div[3]/div[1]/div/div/h2[2]/div[1]/div/div[28]/div[2]/input")).click();
	    
//	    Robot rb=new Robot();
//	    rb.delay(1000);
//	    
//	    StringSelection ss=new StringSelection("C:\\Users\\jakkam sairam\\Downloads");
//	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//	    
//	    rb.keyPress(KeyEvent.VK_CONTROL);
//	    rb.keyPress(KeyEvent.VK_V);
//	    
//	    rb.keyRelease(KeyEvent.VK_CONTROL);
//	    rb.keyRelease(KeyEvent.VK_V);
//	    
//	    rb.keyRelease(KeyEvent.VK_ENTER);
//	    rb.keyRelease(KeyEvent.VK_ENTER);
	    
	    
	    
	    
	}

}
