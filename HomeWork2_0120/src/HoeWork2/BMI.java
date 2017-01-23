package HoeWork2;

import java.util.Scanner;

public class BMI {

	public void operator() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print(">> Please Input Your Height: ");
		double height = input.nextInt();

		System.out.print(">> Please Input Your Weight: ");
		double weight = input.nextInt();

		makeBMI(height, weight);
	}

	public void makeBMI(double height, double weight) {
		double bmi = weight / ((height * 0.01) * (height * 0.01));

		System.out.println("========================================================");
		System.out.println("Your BMI Score Is: " + bmi);
		System.out.println("========================================================");
	}
}
