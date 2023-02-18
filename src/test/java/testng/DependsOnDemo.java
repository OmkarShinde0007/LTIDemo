package testng;

import org.testng.annotations.Test;

public class DependsOnDemo {
	@Test
	public void login() {
		System.out.println("Login");

	}

	@Test(dependsOnMethods = "login")
	public void sendFriendRequest() {
		System.out.println("Sending Friend Request");

	}

	@Test(dependsOnMethods = { "login", "sendFriendRequest" })
	public void acceptFriendRequest() {
		System.out.println("Accepting FriendRequest");
	}

}
