package com.ktds.skd.coffee;

public class LatteMachine extends CoffeeMachine {

	// private int atm;

	public LatteMachine() {
		super.atm = 15; // CoffeeMachine에 있는 atm
		// atm = 15; // LatteMachine에서 만든 atm
	}

	public void latte() {
		System.out.println(atm + " 기압으로 " + "라떼를 추출합니다.");
	}
}
