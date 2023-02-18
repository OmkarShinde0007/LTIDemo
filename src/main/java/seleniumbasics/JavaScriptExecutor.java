package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//scrolling by some pixels
		//js.executeScript("window.scrollBy(0, 750)");
		
		// scrolling upto a element
		WebElement target = driver.findElement(By.xpath("//*[@id=\"11bbf490-16d1-4e06-bca5-ba617dd6f99b\"]/div[1]/h2/span"));
		//js.executeScript("arguments[0].scrollIntoView()", target);
		//Scrolling to the bottom of the page
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		//click on element
		js.executeScript("arguments[0].click()", target);
		
	}

}
