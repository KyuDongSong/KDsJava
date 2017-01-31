package com.ktds.skd;

public class LatteMachine extends CoffeeMachine{

	public LatteMachine(){
		super.atm = 15;
	}
	
	@Override
	public void latte() {
		System.out.println(atm +"기압으로 라떼를 추출한다.");
	}

}
