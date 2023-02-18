package testng;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 3)
	public void m1() {
		System.out.println("TC1");
	}
	@Test(enabled = false)
	public void m2() {
		System.out.println("TC2");
	}

}
