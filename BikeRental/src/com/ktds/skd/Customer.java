package com.ktds.skd;

public class Customer {

	private int money;
	private int quantityOfBike;

	public Customer(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getQuantityOfBike() {
		return quantityOfBike;
	}

	public void setQuantityOfBike(int quantityOfBike) {
		this.quantityOfBike = quantityOfBike;
	}

	public void rent(RentalShop rentalShop) {
		if (money >= rentalShop.getBIKE_PER_MONEY()) {
			quantityOfBike++;
			this.money -= rentalShop.getBIKE_PER_MONEY();
			rentalShop.earnMoney(this);
		} else {
			System.out.println("You Don't Have Enough Money");
		}
	}

	public void showCustomerState() {
		System.out.println("자전거 보유 수: " + quantityOfBike);
		System.out.println("보유 금액: " + money);
	}

}
