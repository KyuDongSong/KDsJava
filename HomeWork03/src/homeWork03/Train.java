package homeWork03;

public class Train {

	private int[][] train = new int[1][10];

	public Train() {
		train = new int[2][10];
	}

	public int[][] getTrain() {
		return train;
	}

	public void setTrain(int[][] train) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 10; j++) {
				this.train[i][j] = 0;
			}
		}
	}

	public void showStateOfTrain() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(train[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void reservation(int col, int row) {
		if (train[col][row] == 1) {
			System.out.println("No Seat. Please Choice Another Seat");
			showStateOfTrain();
		} else {
			System.out.println("Success");
			train[col][row] = 1;
		}
	}

	public void cancel(int col, int row) {
		train[col][row] = 0;
		System.out.println("Sucess Cancel The Seat!");
	}
}
