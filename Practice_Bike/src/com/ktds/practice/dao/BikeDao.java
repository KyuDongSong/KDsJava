package com.ktds.practice.dao;

import java.util.List;

import com.ktds.practice.vo.BikeShopVO;

public interface BikeDao {

	public List<BikeShopVO> rentBikeHighQuality();
	public List<BikeShopVO> rentBikeMiddleQuality();
	public List<BikeShopVO> rentBikeLowQuality();

	public List<BikeShopVO> returnBikeHighQuality(int pay);
	public List<BikeShopVO> returnBikeMiddleQuality(int pay);
	public List<BikeShopVO> returnBikeLowQuality(int pay);
	
	public List<BikeShopVO> showList();
}
