package com.ktds.practice.biz;

import com.ktds.practice.vo.BikeVO;

public interface BikeBiz {

	public BikeVO rentBike(int index);
	public boolean checkBike(BikeVO bikeVO);
	public void returnBike();

	

}
