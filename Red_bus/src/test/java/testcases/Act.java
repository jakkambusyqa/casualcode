package testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Act {

	public static void main(String[] args) {
		
ChromeDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.get("https://www.amazon.in/");
//driver.get("https://www.meesho.com/") 
//driver.navigate().back();
//driver.navigate().forward();

WebElement sel=driver.findElement(By.xpath("//a[text()='Sell on Amazon']"));
Point loc=sel.getLocation();
JavascriptExecutor js=driver;

js.executeScript("window.scrollBy"+loc);
	}}

