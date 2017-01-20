
public class Calculator {
	public void add(int[] arr) {

		int result = arr[0] + arr[1];

		System.out.println(arr[0] + " + " + arr[1] + " = " + result);
	}

	public void minus(int[] arr) {

		int result = arr[0] - arr[1];

		System.out.println(arr[0] + " - " + arr[1] + " = " + result);

	}

	public void addThree(int[] arr) {

		int result = arr[0] + arr[1] + arr[2];

		System.out.println(arr[0] + " + " + arr[1] + " + " + arr[2] + " = " + result);

	}

	public void showSumAndAverage(int[] arr) {
		int sum = arr[0] + arr[1] + arr[2] + arr[3];
		double average = sum / 4.0;

		System.out.println(arr[0] + " + " + arr[1] + " + " + arr[2] + " + " + arr[3] + " = " + sum);
		System.out.println(arr[0] + " , " + arr[1] + " , " + arr[2] + " , " + arr[3] + "'s average = " + average);
	}
}
