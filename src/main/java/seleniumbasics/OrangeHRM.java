package seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/contact-sales/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("Form_getForm_FullName"));
		username.sendKeys("Omkar Shinde");
		Thread.sleep(1000);
		driver.findElement(By.name("Contact")).sendKeys("+917558341484");
		Thread.sleep(1000);
		driver.findElement(By.name("Email")).sendKeys("omkarshinde@gmail.com");
		Thread.sleep(1000);
		
		WebElement dropdown = driver.findElement(By.id("Form_getForm_Country"));
		Select select = new Select(dropdown);
		select.selectByValue("India");
		Thread.sleep(1000);
		WebElement dropdown1 = driver.findElement(By.id("Form_getForm_NoOfEmployees"));
		Select select1 = new Select(dropdown1);
		select1.selectByValue("11 - 15");
		Thread.sleep(1000);
		driver.findElement(By.name("JobTitle")).sendKeys("Engineer");
		Thread.sleep(1000);
		driver.findElement(By.name("Comment")).sendKeys("Hello ");
		Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
       
        wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//div[@class='recaptcha-checkbox-border']"))).click();

		
		driver.findElement(By.id("Form_getForm_action_submitForm")).click();
		
		
		
		
		
		
		
		
				
		
		
		
		
	}

}
