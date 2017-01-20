import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Calculator calculator = new Calculator();
		
		int[] arr = new int[4];

		System.out.print("Please Input NumberOne: ");
		arr[0] = input.nextInt();
		
		System.out.print("Please Input NumberTwo: ");
		arr[1] = input.nextInt();
		
		System.out.print("Please Input NumberThree: ");
		arr[2] = input.nextInt();
		
		System.out.print("Please Input NumberFour: ");
		arr[3] = input.nextInt();


		calculator.add(arr);
		calculator.addThree(arr);
		calculator.showSumAndAverage(arr);
	}
}
