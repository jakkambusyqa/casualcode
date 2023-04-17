package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://openai.com/blog/chatgpt/");

		TakesScreenshot ts = driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(".//screenshots//photo.png");

		FileUtils.copyFile(source, target);

	}

}
