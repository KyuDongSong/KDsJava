package FindMinMax;

import java.util.Scanner;

public class FindMax {

	public void operator() {
		Scanner input = new Scanner(System.in);

		System.out.print("Please Input Number One: ");
		int numOne = input.nextInt();

		System.out.print("Please Input Number One: ");
		int numTwo = input.nextInt();

		System.out.print("Please Input Number One: ");
		int numThree = input.nextInt();

		findMax(numOne, numTwo, numThree);
		showMaxNumber(findMax(numOne, numTwo, numThree));
	}

	public int findMax(int numOne, int numTwo, int numThree) {
		int max = numOne;
		
		// int bigNumber = (numOne < numTwo) ? numOn1 : numTwo;

		if (max < numTwo) {
			max = numTwo;
			if (max < numThree) {
				max = numThree;
			}
		}
		return max;
	}

	public void showMaxNumber(int max) {
		System.out.println("Maximun Number is " + max);

	}
}
