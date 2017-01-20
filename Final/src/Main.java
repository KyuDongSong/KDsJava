import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Final finalTest = new Final();
		Scanner input = new Scanner(System.in);

		// 1. 숫자 3개를 입력받는다.
		System.out.println("Please Input Number1,2,3: ");

		int[] arr = new int[3];
		arr[0] = input.nextInt();
		arr[1] = input.nextInt();
		arr[2] = input.nextInt();

		finalTest.printSumAndAverage(arr);
	}
}
