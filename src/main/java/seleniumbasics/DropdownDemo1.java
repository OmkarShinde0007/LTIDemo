package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownDemo1 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");
		WebElement dropdown = driver.findElement(By.id("Form_getForm_Country"));
		Select select = new Select(dropdown);
		
	
		List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"Form_getForm_Country\"]"));
		for (WebElement webElement : options) {
			
			System.out.println(webElement.getText());
		}
		select.selectByValue("Australia");
		
	}
	}


