package vendingMachine.machine;

import vendingMachine.person.Personskd;

/**
 * 음료를 제공한다.
 * 
 * 제고를 확인한다.
 * 
 * cola, fanta, sprite // money(100, 500, 1000)
 * 
 * @author Admin
 *
 */
public class Machineskd {

	private final int COLA = 1000;
	private final int FANTA = 800;
	private final int SPRITE = 1800;

	private int stockMoney;
	private int stockCola;
	private int stockFanta;
	private int stockSprite;

	public Machineskd(int money, int cola, int fanta, int sprite) {
		System.out.println("Welcome VendingMachine!!");

		setStockMoney(money);
		setStockCola(cola);
		setStockFanta(fanta);
		setStockSprite(sprite);

		System.out.println(this);
	}

	public int getStockMoney() {
		return stockMoney;
	}

	public void setStockMoney(int stockMoney) {
		this.stockMoney = stockMoney;
	}

	public int getStockCola() {
		return stockCola;
	}

	public void setStockCola(int stockCola) {
		this.stockCola = stockCola;
	}

	public int getStockFanta() {
		return stockFanta;
	}

	public void setStockFanta(int stockFanta) {
		this.stockFanta = stockFanta;
	}

	public int getStockSprite() {
		return stockSprite;
	}

	public void setStockSprite(int stockSprite) {
		this.stockSprite = stockSprite;
	}

	public void sellCola(Personskd person) {
		this.stockCola--;
		person.payMoney(COLA);

		this.stockMoney += COLA;
	}

	public void sellFanta(Personskd person) {
		this.stockFanta--;
		person.payMoney(FANTA);

		this.stockMoney += FANTA;
	}

	public void sellSprite(Personskd person) {
		this.stockSprite--;
		person.payMoney(SPRITE);

		this.stockMoney += SPRITE;
	}

	@Override
	public String toString() {

		String message = String.format("콜라 : %d 환타: %d 사이다: %d\n잔액 : %d", this.stockCola, this.stockFanta,
				this.stockSprite, this.stockMoney);
		return message;
	}
}
