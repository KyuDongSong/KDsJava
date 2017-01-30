package homeWork04;

import java.util.Scanner;

public class Main {
	public void start() {
		Theather CGV = new Theather();
		Person person = new Person();

		Scanner input = new Scanner(System.in);

		int choice = 0;

		while (choice != 3) {
			System.out.print("1. Reservation // 2. Cancel // 3. EXIT ");
			choice = input.nextInt();

			if (choice == 1) {
				CGV.showStateOfCGV();
				System.out.print("Choice The Seat Col And Row ");
				int col = input.nextInt();
				int row = input.nextInt();
				person.bookTheather(CGV, col, row);
			} else if (choice == 2) {
				CGV.showStateOfCGV();
				System.out.print("Choice The Seat Col And Row ");
				int col = input.nextInt();
				int row = input.nextInt();
				person.cancelBooking(CGV, col, row);
			} else if (choice == 3) {
				System.out.println("Bye~");
				break;

			} else {
				System.out.print("Wrong input!(1. Reservation // 2. Cancel // 3. EXIT )");
				choice = 0;
			}

		}
	}

	public static void main(String[] args) {
		new Main().start();
	}
}
