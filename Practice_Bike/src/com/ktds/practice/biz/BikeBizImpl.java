package com.ktds.practice.biz;

import java.util.List;
import java.util.Scanner;

import com.ktds.practice.dao.BikeDao;
import com.ktds.practice.dao.BikeDaoImpl;
import com.ktds.practice.vo.BikeShopVO;

import static com.ktds.practice.BikeCostConstants.*;;

public class BikeBizImpl implements BikeBiz {

	private BikeDao bikeDao;

	public BikeBizImpl() {
		bikeDao = new BikeDaoImpl();
	}

	@Override
	public void choiceQuality(int choice) {

		if (choice == 1) {
			bikeDao.rentBikeHighQuality();
		} else if (choice == 2) {
			bikeDao.rentBikeMiddleQuality();
		} else if (choice == 3) {
			bikeDao.rentBikeLowQuality();
		}
		showList();
	}

	@Override
	public void returnBike(int choice, int time) {
		if (choice == 1) {
			bikeDao.returnBikeHighQuality(payHowMuch(choice, time));
		} else if (choice == 2) {
			bikeDao.returnBikeMiddleQuality(payHowMuch(choice, time));
		} else if (choice == 3) {
			bikeDao.returnBikeLowQuality(payHowMuch(choice, time));
		}
		showList();

	}

	private int payHowMuch(int choice, int time) {
		int howMuch = 0;

		if (choice == 1) {
			howMuch = (HIGH_QUALITY * time) / HOUR;
			return howMuch;
		} else if (choice == 2) {
			howMuch = (MIDDLE_QUALITY * time) / HOUR;
			return howMuch;
		} else if (choice == 3) {
			howMuch = (LOW_QUALITY * time) / HOUR;
			return howMuch;
		}
		return howMuch;
	}

	private void showList() {
		List<BikeShopVO> bikeList = bikeDao.showList();

		System.out.println("============ Shop ============");
		System.out.println("고급: " + bikeList.get(0).getStockOfHighQuality());
		System.out.println("중급: " + bikeList.get(0).getStockOfMiddleQuality());
		System.out.println("기본: " + bikeList.get(0).getStockOfLowQuality());
		System.out.println("돈: " + bikeList.get(0).getMoney());
		System.out.println("==============================");

		System.out.println("========== Customer ==========");
		System.out.println("고급: " + bikeList.get(1).getStockOfHighQuality());
		System.out.println("중급: " + bikeList.get(1).getStockOfMiddleQuality());
		System.out.println("기본: " + bikeList.get(1).getStockOfLowQuality());
		System.out.println("돈: " + bikeList.get(1).getMoney());
		System.out.println("==============================");
	}

}
