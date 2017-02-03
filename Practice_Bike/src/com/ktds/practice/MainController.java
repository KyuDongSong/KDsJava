package com.ktds.practice;

import java.util.Scanner;

import com.ktds.practice.biz.BikeBiz;
import com.ktds.practice.biz.BikeBizImpl;
import com.ktds.practice.vo.BikeVO;

public class MainController {

	public void start() {
		BikeBiz bikeBiz = new BikeBizImpl();
		BikeVO bikeVO = new BikeVO();
		
		Scanner input = new Scanner(System.in);
		boolean temp = true;
		int choice;

		while (temp) {
			System.out.println("어떤 자전거를 대여하겠습니까. // 0. 고급 / 1. 중급 / 2. 하급");
			choice = input.nextInt();

			bikeVO =bikeBiz.rentBike(choice);
			temp = bikeBiz.checkBike(bikeVO);

		}

	}

	public static void main(String[] args) {
		new MainController().start();
	}

}
