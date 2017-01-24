package com.ktds.skd.fruitMarket.buyer;

import com.ktds.skd.fruitMarket.seller.Seller;

public class Buyer {

	private int fruitQuantity;
	private int money;

	public Buyer(int fruitQuantity, int money) {
		System.out.println("구매자를 생성합니다!");
		
		setFruitQuantity(fruitQuantity);
		setMoney(money);
		
		System.out.println(this);
	}

	public int getFruitQuantity() {
		return fruitQuantity;
	}

	public void setFruitQuantity(int fruitQuantity) {
		this.fruitQuantity = fruitQuantity;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void buy(Seller seller) {
		seller.sell(this);
		this.fruitQuantity++;
	}

	public void pay(int money) {
		this.money -= money;
	}
	
	@Override
	public String toString() {

		String message = String.format("구매한 상품 개수 : %d\n구매자가 가진 금액 : %d", this.fruitQuantity, this.money);
		return message;
	}

}
