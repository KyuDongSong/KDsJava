import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		GooGooDan ggd = new GooGooDan();

		System.out.println("Please Input Number: ");
		int inputNumber = input.nextInt();

		ggd.showGooGooDan(inputNumber);
	}
}
