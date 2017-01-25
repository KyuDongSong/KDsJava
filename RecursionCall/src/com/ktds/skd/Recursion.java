package com.ktds.skd;

public class Recursion {
	public void call(int index) {
		System.out.println("Recursion.call() 호출 중 ...." + index);

		if (index >= 0) {
			call(--index);
		}
	}
}
