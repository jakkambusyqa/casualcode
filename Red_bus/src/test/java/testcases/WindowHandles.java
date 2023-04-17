package testcases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
    
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	
	driver.findElement(By.id("newWindowBtn")).click();
//
//	String handle=driver.getWindowHandle();
//	
//	System.out.println("the windle handle of the web page is "+handle);
	
	
//	
	Set<String>handles=driver.getWindowHandles();
//	
//   Iterator<String> it=handles.iterator();
//   
//   String parentwindow=it.next();
//   String childwindow=it.next();
//   
//   System.out.println("parent "+parentwindow);
//	System.out.println("child "+childwindow);
//	
//	driver.switchTo().window(parentwindow);
//	System.out.println(driver.getTitle());
	
	
List<String> lst=new ArrayList<String>(handles);	
	
String parent=lst.get(0);

String child=lst.get(1);
	
driver.switchTo().window(parent);
System.out.println(driver.getTitle());

	}

}
