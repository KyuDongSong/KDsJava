package com.ktds.practice.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktds.practice.vo.*;

public class BikeDaoImpl implements BikeDao {

	private List<BikeShopVO> bikeList;

	public BikeDaoImpl() {
		bikeList = new ArrayList<BikeShopVO>();

		BikeShopVO bikeShopVO = new BikeShopVO();
		BikeShopVO customerVO = new BikeShopVO();

		bikeShopVO.setMoney(100000);
		bikeShopVO.setStockOfHighQuality(3);
		bikeShopVO.setStockOfMiddleQuality(3);
		bikeShopVO.setStockOfLowQuality(3);

		customerVO.setMoney(100000);

		makeBikeList(bikeShopVO);
		makeRentList(customerVO);
	}

	private void makeBikeList(BikeShopVO bikeShopVO) {
		bikeList.add(bikeShopVO);
	}

	private void makeRentList(BikeShopVO customerVO) {
		bikeList.add(customerVO);
	}

	@Override
	public List<BikeShopVO> rentBikeHighQuality() {
		bikeList.get(0).setStockOfHighQuality((bikeList.get(0).getStockOfHighQuality() - 1));
		bikeList.get(1).setStockOfHighQuality((bikeList.get(1).getStockOfHighQuality() + 1));

		return bikeList;
	}

	@Override
	public List<BikeShopVO> rentBikeMiddleQuality() {
		bikeList.get(0).setStockOfMiddleQuality((bikeList.get(0).getStockOfMiddleQuality() - 1));
		bikeList.get(1).setStockOfMiddleQuality((bikeList.get(1).getStockOfMiddleQuality() + 1));

		return bikeList;
	}

	@Override
	public List<BikeShopVO> rentBikeLowQuality() {
		bikeList.get(0).setStockOfLowQuality((bikeList.get(0).getStockOfLowQuality() - 1));
		bikeList.get(1).setStockOfLowQuality((bikeList.get(1).getStockOfLowQuality() + 1));

		return bikeList;
	}

	@Override
	public List<BikeShopVO> returnBikeHighQuality(int pay) {
		bikeList.get(0).setStockOfHighQuality((bikeList.get(0).getStockOfHighQuality() + 1));
		bikeList.get(1).setStockOfHighQuality((bikeList.get(1).getStockOfHighQuality() - 1));

		bikeList.get(0).setMoney(bikeList.get(0).getMoney() + pay);
		bikeList.get(1).setMoney(bikeList.get(1).getMoney() - pay);

		return bikeList;
	}

	@Override
	public List<BikeShopVO> returnBikeMiddleQuality(int pay) {
		bikeList.get(0).setStockOfMiddleQuality((bikeList.get(0).getStockOfMiddleQuality() + 1));
		bikeList.get(1).setStockOfMiddleQuality((bikeList.get(1).getStockOfMiddleQuality() - 1));

		bikeList.get(0).setMoney(bikeList.get(0).getMoney() + pay);
		bikeList.get(1).setMoney(bikeList.get(1).getMoney() - pay);

		return bikeList;
	}

	@Override
	public List<BikeShopVO> returnBikeLowQuality(int pay) {
		bikeList.get(0).setStockOfLowQuality((bikeList.get(0).getStockOfLowQuality() - 1));
		bikeList.get(1).setStockOfLowQuality((bikeList.get(1).getStockOfLowQuality() + 1));

		bikeList.get(0).setMoney(bikeList.get(0).getMoney() + pay);
		bikeList.get(1).setMoney(bikeList.get(1).getMoney() - pay);

		return bikeList;
	}

	@Override
	public List<BikeShopVO> showList() {
		return bikeList;
	}

}
