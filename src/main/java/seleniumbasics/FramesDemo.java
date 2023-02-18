package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tinymce");
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		//driver.switchTo().frame(0);
		
		//driver.findElement(By.id("tinymce")).sendKeys("Omkar Shinde");
		WebElement target = driver.findElement(By.xpath("//*[@id=\"mce_0_ifr\"]"));
		
		driver.switchTo().frame(target);
		
		driver.findElement(By.id("tinymce")).clear();
		
		driver.findElement(By.id("tinymce")).sendKeys("Omkar Shinde");
		
		
		
		
		
	}

}
