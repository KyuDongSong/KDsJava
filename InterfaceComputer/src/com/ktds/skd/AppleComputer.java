package com.ktds.skd;

public class AppleComputer implements FaceTime {

	@Override
	public void input() {
		System.out.println("Mac KeyBoard로 입력");
	}

	@Override
	public void compute() {
		System.out.println("Apple CPU로 계산");
	}

	@Override
	public void store() {
		System.out.println("SamSung SSD에 저장");
	}

	@Override
	public void faceTime() {
		System.out.println("카메라로 영상통화를 한다.");
	}

}
