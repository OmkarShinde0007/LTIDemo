package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsDemo {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html)");
		
		driver.findElement(By.id("alertexamples")).click();
		Alert al = driver.switchTo().alert();
		al.accept();
		
		driver.findElement(By.id("confirmexample")).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.id("promptexample"));
		
		driver.switchTo().alert().sendKeys("Omkar");
		driver.switchTo().alert().accept();
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
