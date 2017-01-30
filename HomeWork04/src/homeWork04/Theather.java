package homeWork04;

public class Theather {

	private int[][] CGV = new int[10][10];

	public Theather() {
		CGV = new int[10][10];
	}

	public int[][] getTrain() {
		return CGV;
	}

	public void setCGV(int[][] CGV) {
		System.out.println("================================");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				this.CGV[i][j] = 0;
			}
		}
		System.out.println("================================");
	}

	public void showStateOfCGV() {
		System.out.println("================================");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(CGV[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("================================");
	}

	public void reservation(int col, int row) {
		if (CGV[col][row] == 1) {
			System.out.println("No Seat. Please Choice Another Seat");
			showStateOfCGV();
		} else {
			System.out.println("Success");
			CGV[col][row] = 1;
			showStateOfCGV();
		}
	}

	public void cancel(int col, int row) {
		CGV[col][row] = 0;
		System.out.println("Sucess Cancel The Seat!");
	}

}
