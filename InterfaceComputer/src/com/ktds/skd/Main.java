package com.ktds.skd;

public class Main {
	public static void main(String[] args) {
		Computer samsungComputer = new SamsungComputer();

		samsungComputer.input();
		samsungComputer.compute();
		samsungComputer.store();

		System.out.println("=========================");
		
		Computer lgComputer = new LGComputer();
		lgComputer.input();
		lgComputer.compute();
		lgComputer.store();

		System.out.println("=========================");
		
		/**
		 * FaceTime interface는 Computer interface를 상속받고, 
		 * faceTime()은 AppleComputer에서만 구현된 기능이기 때문에,
		 * FaceTime appleComputer = new AppleComputer() 로 선언함으로써
		 * Computer의 기능과, FaceTime의 기능을 모두 사용할 수 있다.
		 */
		FaceTime appleComputer = new AppleComputer();
		appleComputer.input();
		appleComputer.compute();
		appleComputer.store();
		appleComputer.faceTime();
	}
}
