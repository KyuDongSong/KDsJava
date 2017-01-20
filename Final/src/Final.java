
public class Final {

	void printSumAndAverage(int[] arr) {

		final int CLASS_COUNT = 3;

		// 2. 숫자 3개의 합을 구한다.
		int sum = arr[0] + arr[1] + arr[2];

		// 3. 합계를 출력한다.
		System.out.println("Sum Of Number1,2,3: " + sum);

		// 4. 평균을 구한다.
		double average = sum / CLASS_COUNT;

		// 5. 평균을 출력한다.
		System.out.println("Average Of Number1,2,3: " + average);

	}

}
