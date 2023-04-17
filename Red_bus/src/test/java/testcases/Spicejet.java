package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String date="12";
		String month="January";
		String year="2024";
		
		String monyear = month+" "+year;
		
		driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
		
		String readmonyer = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[1]/div")).getText();
		System.out.println(readmonyer);
		
		while (!readmonyer.equals(monyear)) {
			driver.findElementByXPath("//*[@class= 'css-1dbjc4n r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c']").click();
			readmonyer = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[1]/div")).getText();
			
			System.out.println(readmonyer);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
//		
//		while(true){
//			
//			 String yearmonth =driver.findElement(By.xpath("//div[text()='January ']")).getText();
//			 String arr[]=yearmonth.split(" ");
//			 String mnth=arr[0];
//			 String yr=arr[1];
//			 
//			 
//			 
//			 
//			 
//			 if(mnth.equalsIgnoreCase(month) && yr.equals(year))
//				 break;		 
//			 
//			 else
//				 driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c']")).click();
//			
//		}
//		
//		List<WebElement> alldates=driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088']//div"));
//		for(WebElement dates:alldates){
//			String dt=dates.getText();
//			if (dt.equals(date)){
//				dates.click();
//				break;
//				
//			}
//		
//		
//		
//	}

}}
