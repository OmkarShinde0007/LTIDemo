package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	//To test the same feature with different set of data
	@Test(dataProvider = "GetUserData")
	public void validateLogin(String username, String password) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	@DataProvider(name = "GetUserData")
	public Object[][] getData() {
		
		// First parameter: How many times we want to execute the test case
		//Second parameter: How many parameters we want to send for each execution
		Object[][] data = new Object[3][2];
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		data[1][0] = "hr";
		data[1][1] = "hr123";
		data[2][0] = "finance";
		data[2][1] = "finance123";
		return data;
		
		
	}
	@DataProvider(name = "GetUserDataFromExcel")
	public Object[][] getDataFromExcel(){
		
		ExcelReader reader = new ExcelReader();
		return reader.getUserData();
	}
	

}
