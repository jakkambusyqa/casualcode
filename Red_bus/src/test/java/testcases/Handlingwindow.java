package testcases;

import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwindow {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver ();
driver.get("https://www.guru99.com/traceability-matrix.html");
String id=driver.getWindowHandle();
System.out.println("id is"+id);
	

	}

}
