package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingDemo2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println(driver.getWindowHandle());
		driver.get("https://demo.automationtesting.in/Windows.html");
		String parentWindowTitle = driver.getTitle();
		System.out.println(parentWindowTitle);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String pwindow = it.next();
		String cwindow = it.next();
		System.out.println("Parent window =="+pwindow);
		System.out.println("Child window =="+cwindow);
		//Switch to child window
		driver.switchTo().window(cwindow);
		String childWindowTitle = driver.getTitle();
		System.out.println(	childWindowTitle);
		//again switch to parent window
		driver.switchTo().window(pwindow);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
	}

}
