package com.ktds.skd;

public class AirConditioner extends AirCleaner {

	/**
	 * 냉방 설정 온도
	 */
	private int temp = 26;

	/**
	 * 전원을 켠다.
	 */
	@Override
	public void powerOn() {
		System.out.println("Air Conditioner Power On!!!!!!!!!!!!");
		System.out.println("Cool!!!!!!!!!!!!!!!!");

		cooling();

		System.out.println("공기청정기 제조사: " + super.manufactor);
		System.out.println("공기청정기 제조국: " + super.origin);

		super.powerOn();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	/**
	 * 온도를 낮춘다.
	 */
	public void cooling() {
		temp--;
		System.out.println("Temperator: " + temp);
	}
}
