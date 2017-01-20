
public class CashOrMoney {
	public static void main(String[] args) {
		/*
		 * 현금이 없고 신용카드가 있을 경우 "신용카드로 결제한다"를 출력
		 */

		// 있다 -> true
		// 없다 -> false

		// 현금이 없다.
		boolean hasCash = false;

		// 신용카드가 있다.
		boolean hasCreditCard = true;

		//boolean isCard = hasCash == false && hasCreditCard == true;
		boolean isCard = !hasCash && hasCreditCard == true;

		if (isCard) {
			System.out.println("신용카드로 결제한다.");
		}
	}
}
