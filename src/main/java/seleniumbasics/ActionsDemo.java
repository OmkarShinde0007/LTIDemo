package seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo {
	
	public static void main(String[] args) {
		
		hover();
	}
	
	public static void hover() {
		
		// hover a menu
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=CjwKCAiAioifBhAXEiwApzCztu9d1Xeklz0k6PQIjtUV3HtCP5hXFe9g9MEsylb8_pPenqK3g989PxoCa1kQAvD_BwE");
		WebElement kidsmenu = driver.findElement(By.xpath("//a[text()='kids'][1]"));
		Actions act = new Actions(driver);
		act.moveToElement(kidsmenu).perform();
		
	
	}

}
