package seleniumbasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		captureScreenshot("LoginPage");
		TakesScreenshot ts = (TakesScreenshot) driver;
		driver.findElement(By.linkText("Forgotten password?")).click();
		captureScreenshot("ForgotPassword");
		driver.close();
		
	}
	public static void captureScreenshot(String tcName) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		String path = "./Screenshots/" + tcName + ".png";
		FileUtils.copyFile(file, new File(path));
		
		
	}
	
	
	
	

}
