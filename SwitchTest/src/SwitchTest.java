
public class SwitchTest {
	public static void main(String[] args) {

		// 냄비를 꺼낸다.
		final int READY = 1;

		// 냄비에 물을 넣는다.
		final int WATER = 2;

		// 가스불에 냄비를 올린다.
		final int FIRE = 3;

		// 물을 끓인다.
		final int BOIL = 4;

		// 스프와 면을 넣는다.
		final int INJECT = 5;

		// 익으면 불을 끈다.
		final int OFF = 6;
		// 먹는다
		final int EAT = 7;

		int nowState = 1;
		// 숫자 or 분자열 변수로 비교 가능(문자열은 1.8 이후부터만 사용가능)
		switch (nowState) {
		case READY:
			System.out.println("냄비를 꺼낸다.");
		case WATER:
			System.out.println("냄비에 물을 넣는다.");
		case FIRE:
			System.out.println("가스불을 냄비에 올린다.");
		case BOIL:
			System.out.println("물을 끓인다.");
		case INJECT:
			System.out.println("스프와 면을 넣는다.");
		case OFF:
			System.out.println("익으면 불을 끈다.");
		case EAT:
			System.out.println("먹는다.");
		default:
			System.out.println("설거지를 한다.");
		}

	}
}
