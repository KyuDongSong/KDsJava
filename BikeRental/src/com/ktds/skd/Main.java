package com.ktds.skd;

import java.util.Scanner;

public class Main {

	RentalShop rentalShop = new RentalShop(50000, 100, 5000);
	Customer customer = new Customer(60000);

	public void start() {

		Scanner input = new Scanner(System.in);
		int choice = 0;

		while (choice != 2) {
			System.out.println("WelCome To Bike Rental Shop!");
			System.out.print("Rent?(1. yes / 2. no)");
			choice = input.nextInt();
			if (choice == 1) {
				customer.rent(rentalShop);
			} else if (choice == 2) {
				showState();
				System.out.println("See You~");
			} else {
				System.out.println("Wrong Input(1. Yes / 2. No)");
				choice = 0;
			}
			showState();

		}
	}

	public void showState() {
		System.out.println("==================================");
		System.out.println("자전거 대여점 현황");
		System.out.println("----------------------------------");
		rentalShop.showRentalShopState();
		System.out.println("==================================");
		System.out.println("대여자 현황");
		System.out.println("----------------------------------");
		customer.showCustomerState();
		System.out.println("==================================");
	}

	public static void main(String[] args) {
		new Main().start();
	}

}
