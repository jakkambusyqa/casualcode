package testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> Links=driver.findElementsByTagName("a");
		 for (WebElement joints:Links){
			 String url=joints.getAttribute("href");
			 
			 
			 if (url==null || url.isEmpty())
				 System.out.println("the links are normal");
			 continue;
		 }
		 URL web=new URL(url);
		 HttpURLConnection htp=(HttpsURLConnection) 
		 
				
		
	}

}
