package com.ktds.skd;

public class Car {

	private String model;
	private int volumeOfOilTank;
	private int oilStock;

	private int money;

	public Car(String model, int volumeOfOilTank, int money) {
		super();
		this.model = model;
		this.volumeOfOilTank = volumeOfOilTank;
		this.money = money;
	}

	public int getOilStock() {
		return oilStock;
	}

	public void setOilStock(int oilStock) {
		this.oilStock = oilStock;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getVolumeOfOilTank() {
		return volumeOfOilTank;
	}

	public void setVolumeOfOilTank(int volumeOfOilTank) {
		volumeOfOilTank = volumeOfOilTank;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void fillOil(OilBank oilBank) {
		this.oilStock = this.volumeOfOilTank;

		this.money -= (this.volumeOfOilTank * oilBank.getPricePerLiter());
	}

}
