package testng;



import org.testng.annotations.Test;

public class GroupsDemo {
	
	@Test(groups = "smoke")
	public void ValidateLogin() {
		System.out.println("Smoke TC: Validate Login ");
		
	}
	@Test(groups = "smoke")
    public void ValidateForgotPassword() {
		System.out.println("Smoke TC: Validate Password");
		
	}
	@Test(groups = "smoke, dashboard")
    public void dashboard() {
	    System.out.println("Smoke: Dashboard");
	
    }
	@Test(groups = "regression")
    public void homepage() {
	    System.out.println("Regression: Homepage");
	
    }
	@Test(groups = "regression")
    public void reports() {
	    System.out.println("Regression: Reports");
	
    }
	@Test(groups = "smoke, reports")
    public void reports1() {
	    System.out.println("Smoke: Reports1");
	
    }
	@Test(groups = "regression")
    public void reports2() {
	    System.out.println("Regression: Reports2");
	
    }
	@Test
	public void m2() {
		System.out.println("m2");
	}
		


}
