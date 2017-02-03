package com.ktds.practice.dao;

import java.util.List;

import com.ktds.practice.vo.BikeVO;

public interface BikeDao {

	public void rentBike(int index, BikeVO bikeVO);

	public void returnBike(int index, BikeVO bikeVO);

	public void setList(BikeVO bikeVO);

	public List<BikeVO> getList();

}
