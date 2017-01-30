package homeWork03;

import homeWork03.Train;

public class Passenger {
	
	Train train = new Train();

	public void bookTrain(Train train, int col, int row) {
		train.reservation(col, row);
	}

	public void cancelBooking(Train train, int col, int row) {
		train.cancel(col, row);
	}
}
