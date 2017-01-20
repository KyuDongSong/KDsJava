
public class Main {
	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		
		for (i = 0; i < 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("%");
			}
			System.out.println();
		}
		
		for (i = 0; i < 5; i++) {
			for (j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
