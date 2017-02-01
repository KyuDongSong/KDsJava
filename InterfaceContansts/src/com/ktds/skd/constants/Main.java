package com.ktds.skd.constants;

import static com.ktds.skd.MemberGradeConst.*;;

public class Main {

	public void start() {
		int grade = 0;

		if (grade == ADMIN) {
			System.out.println("Welcome Admin");
		} else if(grade == GUEST){
			System.out.println("Welcome Guest");
		} else if(grade == MEMBER){
			System.out.println("Welcome Member");
		}
	}

	public static void main(String[] args) {
		new Main().start();
	}
}
