package testcases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HANdlingwindows {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("newTabBtn")).click();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		
		Set<String>handles=driver.getWindowHandles();
		
		

		List<String> lst=new ArrayList<String>(handles);
		
		String parent=lst.get(0);
		String child=lst.get(1);
		
		System.out.println("parent tab "+parent);
		System.out.println("child tab "+child);
		
		
		
		
		
		
		
		
		
		
		
		
		
		// itertaor and converting set to list
//
//		Iterator<String> itr = windowhandles.iterator();
//
//		String parent = itr.next();
//		String child = itr.next();
//
//		System.out.println("parent window " + parent);
//		System.out.println("child window " + child);
////		
//		driver.switchTo().window(parent);
		
		
//		
//		System.out.println(driver.getTitle());
//
//		
//		driver.switchTo().window(child);
//		
//		System.out.println(driver.getTitle());
//		
	}

}
