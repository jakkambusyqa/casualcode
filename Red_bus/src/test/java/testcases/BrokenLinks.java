package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
//driver.findElementByLinkText("Book a Free Demo").click();
	//driver.findElementByPartialLinkText("Book a").click();
     List<WebElement> links=driver.findElements(By.tagName("a"));	
	
	System.out.println("size of links is"+links.size());
	
	for (int i = 0; i < links.size(); i++) {
		
	System.out.println(links.get(i).getText());
//	System.out.println(links.get(i).getAttribute("a"));
	}
	
	
	
	}}


