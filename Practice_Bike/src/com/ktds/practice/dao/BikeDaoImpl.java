package com.ktds.practice.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktds.practice.vo.BikeVO;

public class BikeDaoImpl implements BikeDao {

	List<BikeVO> bikeList;
	BikeVO bikeVO1;
	BikeVO bikeVO2;
	BikeVO bikeVO3;

	public BikeDaoImpl() {
		bikeList = new ArrayList<BikeVO>();
		bikeVO1 = new BikeVO();
		bikeVO2 = new BikeVO();
		bikeVO3 = new BikeVO();

		bikeVO1.setMoney(5000);
		bikeVO1.setStock(3);
		setList(bikeVO1);
		bikeVO2.setMoney(3000);
		bikeVO2.setStock(3);
		setList(bikeVO2);
		bikeVO3.setMoney(1000);
		bikeVO3.setStock(3);
		setList(bikeVO3);

	}

	@Override
	public void rentBike(int index, BikeVO bikeVO) {
		bikeList.set(index, bikeVO);
	}

	@Override
	public void returnBike(int index, BikeVO bikeVO) {
		bikeList.set(index, bikeVO);

	}

	@Override
	public void setList(BikeVO inputBikeVO) {
		bikeList.add(inputBikeVO);

	}

	@Override
	public List<BikeVO> getList() {
		return bikeList;
	}

}
