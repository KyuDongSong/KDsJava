package com.ktds.practice.biz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ktds.practice.dao.BikeDao;
import com.ktds.practice.dao.BikeDaoImpl;
import com.ktds.practice.vo.BikeVO;

public class BikeBizImpl implements BikeBiz {

	BikeDao bikeDao;
	List<BikeVO> bikeList;

	Scanner input = new Scanner(System.in);

	public BikeBizImpl() {
		bikeDao = new BikeDaoImpl();
		bikeList = new ArrayList<BikeVO>();

	}

	@Override
	public BikeVO rentBike(int index) {
		List<BikeVO> tempBikeList = bikeDao.getList();

		BikeVO bikeVO = tempBikeList.get(index);

		bikeVO.setStock(bikeVO.getStock()-1);
		
		return bikeVO;
		
	}

	public boolean checkBike(BikeVO bikeVO) {
		if (bikeVO.getStock() == 0) {
			System.out.println("재고부족");
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void returnBike() {
		int rentalShopMoney = 

	}



}
