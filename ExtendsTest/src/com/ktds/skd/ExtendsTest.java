package com.ktds.skd;

public class ExtendsTest {

	public void start() {
		String str = "Extends Test...";
		// String str = new String("Extends Test...");
		
		Object obj = new String(str);
		System.out.println(obj);
	}

	public static void main(String[] args) {
		ExtendsTest extendsTest = new ExtendsTest();
		extendsTest.start();
		extendsTest.equals(" ");
	}
}
