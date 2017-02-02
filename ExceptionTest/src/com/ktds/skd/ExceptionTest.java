package com.ktds.skd;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			convertStringToNumber(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("문자를 다시 생성한다.");
		}
	}

	public static void convertStringToNumber(String str) throws Exception {
		if (str == null) {
			throw new Exception("Make Parameter!!!!!!!");
		}
		int number = Integer.parseInt("NUMBER");
	}
}
