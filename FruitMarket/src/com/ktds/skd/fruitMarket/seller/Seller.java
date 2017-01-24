package com.ktds.skd.fruitMarket.seller;

import com.ktds.skd.fruitMarket.buyer.Buyer;

public class Seller {

	private final int PRICE = 3000;

	private int fruitQuantity;
	private int money;

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

	public Seller(int fruitQuantity, int money) {
		System.out.println("판매자를 생성");

		setFruitQuantity(fruitQuantity);
		setMoney(money);

		System.out.println(this);
	}

	public void sell(Buyer buyer) {
		fruitQuantity--;
		buyer.pay(PRICE);
		this.money += PRICE;
	}

	@Override
	public String toString() {

		String message = String.format("판매자의 상품 개수 : %d\n판매자가 가진 금액 : %d", this.fruitQuantity, this.money);
		return message;
	}

}
