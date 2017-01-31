package com.ktds.skd.coffee;

public class Cafe2 {
	public static void main(String[] args) {
		CoffeeMachine coffeeMachine = new CoffeeMachine();
		CoffeeMachine latteMachine = new LatteMachine();
		coffeeMachine.espresso();
		coffeeMachine.latte();
		
		latteMachine.espresso();
		latteMachine.latte();
		
		Barista barista = new Barista();
		barista.coffee(coffeeMachine);
		barista.coffee(latteMachine);
	}
}
