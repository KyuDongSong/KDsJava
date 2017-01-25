package com.ktds.skd;

public class RentalShop {

	private int budget;
	private int stockOfBike;
 
	private int BIKE_PER_MONEY;

	public RentalShop(int budget, int stockOfBike, int bikePerMoney) {
		this.budget = budget;
		this.stockOfBike = stockOfBike;
		this.BIKE_PER_MONEY = bikePerMoney;
	}

	public int getBIKE_PER_MONEY() {
		return BIKE_PER_MONEY;
	}

	public void setBIKE_PER_MONEY(int bIKE_PER_MONEY) {
		BIKE_PER_MONEY = bIKE_PER_MONEY;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public int getStockOfBike() {
		return stockOfBike;
	}

	public void setStockOfBike(int stockOfBike) {
		this.stockOfBike = stockOfBike;
	}

	public void earnMoney(Customer customer) {
		this.stockOfBike -= customer.getQuantityOfBike();
		this.budget += BIKE_PER_MONEY;
	}

	public void showRentalShopState() {
		System.out.println("자전거 보유 수: " + stockOfBike);
		System.out.println("대여로 총 합: " + budget);
	}

}
