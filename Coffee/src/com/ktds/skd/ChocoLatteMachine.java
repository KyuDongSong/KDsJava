package com.ktds.skd;

public class ChocoLatteMachine extends CoffeeMachine {

	public ChocoLatteMachine() {
		super.atm = 15;
	}

	@Override
	public void latte() {
		System.out.println(atm + "기압으로 라떼를 추출한다.");
		System.out.println("초코시럽을 듬뿍 넣습니다.");
		System.out.println("생크림을 듬뿍 넣습니다.");
		System.out.println("시나몬을 뿌려줍니다.");
		System.out.println("5000원 입니다.");
	}

}
