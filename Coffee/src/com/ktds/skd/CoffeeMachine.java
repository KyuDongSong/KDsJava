package com.ktds.skd;

public abstract class CoffeeMachine {

	protected int atm = 9;

	public void espresso() {
		System.out.println(atm + " 기압으로 에스프레소를 추출한다.");
	}

	public abstract void latte();
}
