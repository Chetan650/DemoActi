package com.trello.qspiders.learntestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationOrder {
	@BeforeMethod
	public void login() {
		System.out.println("login");
	}

	@AfterMethod
	public void logout() {
		System.out.println("logout");

	}

	@BeforeClass
	public void signin() {
		System.out.println("signin");

	}

	@BeforeTest
	public void configBeforeTest() {
		System.out.println("configBeforeTest");

	}

	@Test
	public void uploadProfilePic() {
		System.out.println("uploadProfilePic");

	}

	@Test(dependsOnMethods = "uploadProfilePic")
	public void sendFriendrequest() {
		System.out.println("sendFriendrequest");

	}

	@Test(dependsOnMethods = "sendFriendrequest")
	public void acceptFriendRequest() {
		System.out.println("acceptFriendRequest");

	}
}
