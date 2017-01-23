package HoeWork2;

import java.util.Scanner;

public class SumAndAverage {

	Scanner input = new Scanner(System.in);

	public void operator() {

		int score = 0;

		System.out.print("Please Input How Many Scores: ");
		int count = input.nextInt();
		int[] arr = new int[count];

		for (int i = 0; i < count; i++) {
			System.out.print("Please Input " + (i + 1) + "th" + " Score : ");
			score = input.nextInt();

			arr[i] = score;
		}

		makeAndShowSumAndAverage(arr);
	}

	public void makeAndShowSumAndAverage(int[] arr) {
		double average = 0;
		int 	sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		average = sum / arr.length;

		System.out.println("========================================================");
		System.out.println("Sum Is: " + sum);
		System.out.println("Average Is: " + average);
		System.out.println("========================================================");
	}
}
