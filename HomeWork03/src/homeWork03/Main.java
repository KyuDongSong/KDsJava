package homeWork03;

import java.util.Scanner;

public class Main {

	public void start() {
		Train train = new Train();
		Passenger passenger = new Passenger();

		Scanner input = new Scanner(System.in);

		int choice = 0;

		while (choice != 3) {
			System.out.print("1. Reservation // 2. Cancel // 3. EXIT ");
			choice = input.nextInt();

			if (choice == 1) {
				train.showStateOfTrain();
				System.out.print("Choice The Seat Col And Row ");
				int col = input.nextInt();
				int row = input.nextInt();
				passenger.bookTrain(train, col, row);
				train.showStateOfTrain();
			} else if (choice == 2) {
				train.showStateOfTrain();
				System.out.print("Choice The Seat Col And Row ");
				int col = input.nextInt();
				int row = input.nextInt();
				passenger.cancelBooking(train, col, row);
				train.showStateOfTrain();
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
