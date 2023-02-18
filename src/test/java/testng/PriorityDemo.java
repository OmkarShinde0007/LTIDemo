package testng;
import org.testng.annotations.Test;
public class PriorityDemo {
	
	@Test(priority = 1)
	
	public void orange() {
		System.out.println("Orange");
	}
	@Test(priority = 3)
	public void apple() {
		System.out.println("Apple");
	}
	@Test(priority = 2)
	public void mango() {
		System.out.println("Mango");
	}
	@Test()
	public void grapes() {
		System.out.println("Grapes");
	}
	@Test(priority = 2)
	public void banana() {
		System.out.println("banana");
	}
	@Test(priority = -1)
	public void chickoo() {
		System.out.println("Chickoo");
	}

}
