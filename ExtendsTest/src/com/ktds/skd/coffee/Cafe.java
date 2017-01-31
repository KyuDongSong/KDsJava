package com.ktds.skd.coffee;

public class Cafe {
	public static void main(String[] args) {
		CoffeeMachine espressoMachine = new CoffeeMachine();
		espressoMachine.espresso();

		// Sub Class Is A Super Class
		System.out.println("=========== Latte Machine ===========");
		// LatteMachine latteMachine = new LatteMachine();
		// latteMachine.latte();
		CoffeeMachine latteMachine = new LatteMachine();
		latteMachine.espresso();

		/**
		 * => LatteMachine latte = (LatteMachine)latteMachine;
		 */
		((LatteMachine) latteMachine).latte();

		System.out.println(espressoMachine);
		System.out.println(latteMachine);
	}
}
