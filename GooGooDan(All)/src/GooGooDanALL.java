
public class GooGooDanALL {
	public static void main(String[] args) {

/*		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " x " + j + " = " + (i * j) + "   ");
			}
			System.out.println();
		}*/

		int i = 2;
		int j = 1;
		while (i < 10) {
			while (j < 10) {
				System.out.print(i + " x " + j + " = " + (i * j) + "   ");
				j++;
			}
			System.out.println();
			i++;
			j = 1; // while문에서는 초기화 과정 중요함.
		}
	}
}
