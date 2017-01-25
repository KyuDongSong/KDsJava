package com.ktds.skd;

public class OilBank {

	private int oilStock;
	private int pricePerLiter;
	private int budget;

	public int getOilStock() {
		return oilStock;
	}

	public void setOilStock(int oilStock) {
		this.oilStock = oilStock;
	}

	public int getPricePerLiter() {
		return pricePerLiter;
	}

	public void setPricePerLiter(int pricePerLiter) {
		this.pricePerLiter = pricePerLiter;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public void filling(Car car) {
		this.oilStock -= car.getVolumeOfOilTank();

		System.out.println(this);
		car.fillOil(this);

		this.budget += car.getVolumeOfOilTank();
	}

}
