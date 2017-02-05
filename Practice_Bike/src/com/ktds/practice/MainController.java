package com.ktds.practice;

import java.util.Scanner;

import com.ktds.practice.biz.BikeBiz;
import com.ktds.practice.biz.BikeBizImpl;

public class MainController {

	public void start() {

		BikeBiz bikeBiz = new BikeBizImpl();

		Scanner input = new Scanner(System.in);

		// 대여 자전거 선택
		System.out.println("========== Welcome To BikeRentalShop ==========");
		System.out.println("자전거 선택(1. 고급 / 2. 중급 / 3. 기본)");
		int choice = input.nextInt();
		bikeBiz.choiceQuality(choice);

		System.out.println("대여 시간을 입력하세요.");
		int time = input.nextInt();

		bikeBiz.returnBike(choice, time);
		
		input.close();

	}

	public static void main(String[] args) {
		new MainController().start();
	}

}
