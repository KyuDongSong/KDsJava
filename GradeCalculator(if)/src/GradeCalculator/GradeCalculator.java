package GradeCalculator;

import java.util.Scanner;

public class GradeCalculator {

	public void operator() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		showInputMessageManage();
		int manage = sc.nextInt();
//test
		showInputMessageMath();
		int math = sc.nextInt();

		showInputMessageAlgorithm();
		int algorithm = sc.nextInt();

		showSum(calcSum(manage, math, algorithm));
		showAverage(calcAverage(calcSum(manage, math, algorithm)));
		isAverageOverNinty(calcAverage(calcSum(manage, math, algorithm)));

	}

	public void showInputMessageMath() {
		System.out.print("Please Input Math Score: ");
	}

	public void showInputMessageManage() {
		System.out.print("Please Input Manamge Score: ");
	}

	public void showInputMessageAlgorithm() {
		System.out.print("Please Input Algorithm Score: ");
	}

	public int calcSum(int manage, int math, int algorithm) {

		int sum = manage + math + algorithm;

		return sum;
	}

	public void showSum(int sum) {
		System.out.println("Sum Is: " + sum);
	}

	public int calcAverage(int sum) {
		int average = sum / 3;

		return average;
	}

	public void isAverageOverNinty(int average) {
		if (average >= 90) {
			System.out.println("Great!");
		} else if (average >= 70 && average <= 80) {
			System.out.println("SoSo..");
		} else if (average >= 60 && average <= 70) {
			System.out.println("Oh..");
		} else {
			System.out.println("Please Study Hard..");
		}
	}

	public void showAverage(int average) {
		System.out.println("Average Is: " + average);
	}
}
