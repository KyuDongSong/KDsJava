
public class Hospital {
	public static void main(String[] args) {

		// 의사(담당자)를 생성한다.
		Doctor kdSong = new Doctor();

		kdSong.inquery();
		kdSong.treatment();
		kdSong.prescription();

		System.out.println();

		// 다른 의사 생성
		Doctor ymNam = new Doctor();

		ymNam.inquery();
		ymNam.treatment();
		ymNam.prescription();

	}
}
