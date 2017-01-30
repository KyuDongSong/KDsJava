package homeWork04;

import homeWork04.Theather;

public class Person {
	
	Theather theather = new Theather();

	public void bookTheather(Theather cGV, int col, int row) {
		theather.reservation(col, row);
	}

	public void cancelBooking(Theather cGV, int col, int row) {
		theather.cancel(col, row);
	}

}
