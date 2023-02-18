package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingApplication2 {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.orangehrm.com/contact-sales/");
		WebElement username = driver.findElement(By.id("Form_getForm_FullName"));
		username.sendKeys("Omkar");
		
		driver.findElement(By.name("Contact")).sendKeys("7558341484");
		driver.findElement(By.name("Email")).sendKeys("omkarshinde0000@gmail.com");
		
		
				
		
		
		
		
	}

}
