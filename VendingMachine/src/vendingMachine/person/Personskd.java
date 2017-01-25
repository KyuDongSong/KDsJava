package vendingMachine.person;

import vendingMachine.machine.Machineskd;

/**
 * 자판기에서 음료를 고른다 동전을 투입한다. 음료를 받는다. 잔돈을 받는다.
 * 
 * money(100, 500, 1000)
 * 
 * @author Admin
 *
 */
public class Personskd {

	private int money;
	private int drink;

	public Personskd(int money, int drink) {
		setMoney(money);
		setDrink(drink);
		
		System.out.println(this);
	}
	
	public int getDrink() {
		return drink;
	}

	public void setDrink(int drink) {
		this.drink = drink;
	}


	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void chooseDrink(int input, Machineskd machine) {
		if (input == 1) {
			machine.sellCola(this);
			this.drink++;
		} else if (input == 2) {
			machine.sellFanta(this);
			this.drink++;
		} else if (input == 3) {
			machine.sellSprite(this);
			this.drink++;
		}
	}

	public void payMoney(int money) {
		this.money -= money;
	}
	
	@Override
	public String toString() {

		String message = String.format("음료 개수 : %d\n가진 금액 : %d", this.drink, this.money);
		return message;
	}

}
