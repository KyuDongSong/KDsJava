package vendingMachine;

import vendingMachine.machine.Machine;
import vendingMachine.person.Person;

import java.util.Scanner;

public class VendingMachine {

	public void start() {
		Person person = new Person(5000, 0);
		Machine machine = new Machine(500000, 100, 100, 100);
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
		new VendingMachine().start();
	}
}
