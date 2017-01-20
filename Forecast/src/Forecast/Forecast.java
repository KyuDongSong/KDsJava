package Forecast;

import java.util.Scanner;

public class Forecast {
	public void operator() {
		Scanner input = new Scanner(System.in);
		int weather = 0;

		while (weather != 3) {
			System.out.print("Please Input Weather Condition(1. Rain / 2. Sunny)");
			weather = input.nextInt();
			
			if (weather == 1 || weather == 2) {
				forecast(weather);
			} else {
				System.out.println("EXIT THE PROGRAM....");
				break;
			}

		}
	}

	public void forecast(int weather) {
		if (weather == 1) {
			showMessageUmbrella();
		} else if (weather == 2) {
			showMessageNoUmbrella();
		}

	}

	public void showMessageUmbrella() {
		System.out.println("You Need Umbrella");
	}

	public void showMessageNoUmbrella() {
		System.out.println("You Don't Need Umbrella");

	}
}
