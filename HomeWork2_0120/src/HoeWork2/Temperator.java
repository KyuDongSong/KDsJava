package HoeWork2;

import java.util.Scanner;

public class Temperator {

	Scanner input = new Scanner(System.in);

	public void operator() {

		System.out.print("Please Input Number(1. c -> f / 2. f -> c)");
		int number = input.nextInt();

		chooseTemperator(number);
	}

	public void chooseTemperator(int number) {
		if (number == 1) {
			System.out.print("Please Input Celsius: ");
			double celsius = input.nextInt();
			
			showCelsiusToFahrenheit(celsius);
		} else if (number == 2) {
			System.out.print("Please Input Celsius: ");
			double fahrenheit = input.nextInt();
			
			showFarenheitToCelsiut(fahrenheit);
		}
	}

	public double showCelsiusToFahrenheit(double celsius) {
		
		double fahrenheit = ((celsius * 1.8) + 32);
		
		System.out.println("========================================================");
		System.out.println("Celsius " + celsius + " = " + "Fahrenheit " + fahrenheit);
		System.out.println("========================================================");

		return fahrenheit;
	}

	public double showFarenheitToCelsiut(double fahrenheit) {
		
		double celsius = ((fahrenheit - 32) / 1.8);
		
		System.out.println("========================================================");
		System.out.println("Fahrenheit " + fahrenheit + " = " + "celsius " + celsius);
		System.out.println("========================================================");

		return celsius;
	}
}
