
public class ConvenienceStore {
	public static void main(String[] args) {
		Customer kdSong = new Customer();

		kdSong.findProduct();
		kdSong.choiceCash();
		kdSong.buying();

		Staff ymNam = new Staff();

		ymNam.barcode();
		ymNam.talk();
		ymNam.payment();
	}
}
