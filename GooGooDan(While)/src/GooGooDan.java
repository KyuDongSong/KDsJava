import java.util.Scanner;

public class GooGooDan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("======= 구구단을 프로그램 =======");
		System.out.println("원하시는 구구단을 입력하세요.(입력 범위 : 2 ~ 9)");

		System.out.print("원하는 구구단: ");
		int dan = input.nextInt();

		System.out.println("===============================");
		System.out.println("구구단 " + dan + " 단을 출력합니다.");

		int i = 1;

		while (i < 10) {
			System.out.println(dan + "x" + i + " = " + (dan * i));
			i++;
		}
		System.out.print("===============================");
	}
}
