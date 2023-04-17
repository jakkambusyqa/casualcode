package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		
		
		driver.get("https://www.redbus.in/");
		// WebElement data;

		driver.findElement(By.id("src")).sendKeys("war");
		//WebElement data = driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[1]/div/ul"));
		List<WebElement> auto = driver.findElements(By.tagName("li"));
		for (int i = 0; i < auto.size(); i++) {
			if (auto.get(i).getText().contains("Warangal")) {
				auto.get(i).click();
				break;
			}
//		}
//		driver.findElement(By.id("dest")).sendKeys("hyd");
//		List<WebElement> aut = driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[2]/div/ul")).findElements(By.tagName("li"));
//		for (int a = 0; a < aut.size(); a++) {
//			if (aut.get(a).getText().contains("Tarnaka, Hyderabad")) {
//				aut.get(a).click();
//				break;
//			}
//		}
//		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
//		String dob = "13-May-2023";
//		String[] abc = dob.split("-");
//		String date = abc[0];
//		String month = abc[1];
//		String year = abc[2];
//
//		String monyear = month + " " + year;
//		String mh = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText();
//
//		while (!mh.equals(monyear)) {
//			driver.findElement(By.className("next")).click();
//			mh = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText();
//		}
//		WebElement gfd = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table"));
//		List<WebElement> rows = gfd.findElements(By.tagName("tr"));
//		for (int i = 2; i < rows.size(); i++) {
//			List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
//			for (int j = 0; j < col.size(); j++) {
//				if (col.get(j).getText().contains(date)) {
//					col.get(j).click();
//					break;
//				}
//			}
//
//		}
//		driver.findElement(By.id("search_btn")).click();
//
//
		
		
	}

	}}
