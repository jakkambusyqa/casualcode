package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
WebElement list=driver.findElement(By.xpath("//select[@id='first']"));
list.click();
Select sel=new Select(list);
sel.selectByVisibleText("Google");
	}

}
