package com.actitime.pom;

public class D {
	public static void main(String[] args) {
		C e = new C(10);
		int a = e.get();
		System.out.println(a); 
		e.set(40);
		System.out.println(e.get());
	}
}
