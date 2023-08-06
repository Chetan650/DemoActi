package com.trello.qspiders.learntestng;

import org.testng.annotations.Test;

public class UsageOfEnabled {
	@Test(priority = 2)
	public void karakoram() {
		System.out.println("karakoram");
	}

	@Test(priority = 1)
	public void ladakh() {
		System.out.println("ladakh");
	}

	@Test(priority = 3, invocationCount = 2, enabled = false)
	public void zaskar() {
		System.out.println("zaskar");
	}

	@Test(priority = 4, invocationCount = 3)
	public void pirpanjal() {
		System.out.println("pirpanjal");
	}

	@Test(priority = 6, enabled = true)
	public void siwaliks() {
		System.out.println("siwaliks");
	}

	@Test(priority = 5)
	public void kailash() {
		System.out.println("kailash");
	}
}
