package com.ktds.skd;

public class LGComputer implements Computer {

	@Override
	public void input() {
		System.out.println("LG 키보드와 LG 마우스로 입력한다.");
	}

	@Override
	public void compute() {
		System.out.println("Intel 6세대 CPU i7을 사용해 계산한다.");
	}

	@Override
	public void store() {
		System.out.println("HDD에 저장한다.");
	}

}
