package vendingMachine;

import vendingMachine.machine.Machineskd;
import vendingMachine.person.Personskd;

import java.util.Scanner;

public class VendingMachineSKD {

	public void start() {
		Personskd person = new Personskd(5000, 0);
		Machineskd machine = new Machineskd(500000, 100, 100, 100);
		Scanner input = new Scanner(System.in);
		int num = 0;

		while (num != 4) {
		System.out.println("Choice The Drink(1. COLA, 2. FANTA, 3. SPRITE 4. BYE~)");
			num = input.nextInt();
			person.chooseDrink(num, machine);
			
			System.out.println(person);
			System.out.println(machine);
			
		}
		System.out.println("bye~!");
	}

	public static void main(String[] args) {
		new VendingMachineSKD().start();
	}
}
