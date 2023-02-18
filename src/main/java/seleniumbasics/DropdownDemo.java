package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		Select select = new Select(dropdown);
		//select.selectByIndex(1);
		//select.selectByValue("2");
		//select.selectByVisibleText("Option 2");
	
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='dropdown']/option"));
		for (WebElement webElement : options) {
			
			System.out.println(webElement.getText());
		}
		driver.close();
	}
}
