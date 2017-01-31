package com.ktds.skd;

public class Cafe2 {
	public static void main(String[] args) {
		CoffeeMachine coffeeMachine = new EspressoMachine();
		CoffeeMachine latteMachine = new LatteMachine();
		CoffeeMachine chocolatteMachine = new ChocoLatteMachine();
		coffeeMachine.espresso();
		coffeeMachine.latte();

		latteMachine.espresso();
		latteMachine.latte();

		Barista barista = new Barista();
		barista.coffee(coffeeMachine);
		barista.coffee(latteMachine);
		barista.coffee(chocolatteMachine);
	}
}
