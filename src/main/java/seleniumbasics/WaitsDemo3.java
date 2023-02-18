package seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsDemo3 {
	
	public static void main(String[] args) {
		
		//explicitwait();
		//implicitwait();
		//rightclick();
		//keyboardEvents();
		//dragDrop();
		scroll();
	}
	public static void implicitwait() {
		
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			//Thread.sleep(5000);
			//Instead of thread we use implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//we use implicit once
			WebElement username = driver.findElement(By.name("username"));
			username.sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			
	}
	
	public static void explicitwait() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.findElement(By.id("timingAlert")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		
		
	}
	
	public static void rightclick() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://facebook.com");
		Actions act = new Actions(driver);
		WebElement username = driver.findElement(By.id("email"));
		act.moveToElement(username).contextClick().perform();
		
		
		
	}
	
	public static void keyboardEvents() {
		String user = "omkarshinde";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://facebook.com");
		Actions act = new Actions(driver);
		WebElement username = driver.findElement(By.id("email"));
		act.moveToElement(username).click().keyDown(Keys.SHIFT).sendKeys(user).keyUp(Keys.SHIFT).perform();
		
		
	}
	
	public static void dragDrop() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame = driver.findElement(By.xpath("//iframe[1]"));
		driver.switchTo().frame(frame);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
		
		
	}
	
	public static void scroll() {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		Actions act = new Actions(driver);
		// this is for scroll by specific amount of pixels
		//act.scrollByAmount(0, 750).perform();
		
		WebElement target = driver.findElement(By.xpath("//span[text()='Best sellers in Computers & Accessories']"));
		
		act.scrollToElement(target).perform();
		
	}
	
	
	

}
