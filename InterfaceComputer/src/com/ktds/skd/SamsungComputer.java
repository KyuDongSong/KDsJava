package com.ktds.skd;

public class SamsungComputer implements Computer {

	@Override
	public void input() {
		System.out.println("키보드와 마우스로 입력을 한다.");
	}

	@Override
	public void compute() {
		System.out.println("Intel 7세대 CPU I7을 사용해 계산 한다.");
	}

	@Override
	public void store() {
		System.out.println("SSD에 저장을 한다.");
	}

}
