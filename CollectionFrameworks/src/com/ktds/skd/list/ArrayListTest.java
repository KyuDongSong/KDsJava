package com.ktds.skd.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public void start() {
		/**
		 * 배열 만드는 법
		 */
		int[] scoreArray = new int[4];

		/**
		 * List 만드는 법
		 */
		List<Integer> scoreList = new ArrayList<Integer>();

		/**
		 * 배열에 데이터를 넣는 방법
		 */
		scoreArray[0] = 100;
		scoreArray[1] = 90;
		scoreArray[2] = 80;
		scoreArray[3] = 70;

		/**
		 * List에 데이터를 넣는 방법
		 */

		scoreList.add(100);
		scoreList.add(90);
		scoreList.add(80);
		scoreList.add(70);

		/**
		 * 배열 데이터를 출력하는 방법 1. for 2. for each
		 */
		for (int i = 0; i < scoreArray.length; i++) {
			System.out.println(scoreArray[i]);
		}
		for (int score : scoreArray) {
			System.out.println(score);
		}

		/**
		 * List의 데이터를 출력하는 방법 1. for 2. for each
		 */
		for (int i = 0; i < scoreList.size(); i++) {
			System.out.println(scoreList.get(i));
		}
		for (int score : scoreList) {
			System.out.println(score);
		}

		/**
		 * 배열 데이터 수정(1번 값을 10으로 수정)
		 */
		scoreArray[1] = 10;

		/**
		 * List 데이터 수정(1번 값을 10으로 수정)
		 */
		scoreList.set(1, 10);

		/**
		 * 배열 데이터 삭제(불가능)
		 */

		/**
		 * List 데이터 삭제하기(1번 인덱스 삭제)
		 */
		scoreList.remove(1);

		/**
		 * 배열 데이터 검색(80 있는지 확인)
		 */
		for (int i = 0; i < scoreArray.length; i++) {
			if (scoreArray[i] == 80) {
				System.out.println("80은" + i + "번 인덱스에 있음");
			}
		}

		/**
		 * List 데이터 검색하기(80이 있는지 확인)
		 */
		if (scoreList.contains(80)) {
			System.out.println("80은" + scoreList.lastIndexOf(80) + "번 인덱스에 있음");
		}

	}

	public static void main(String[] args) {
		new ArrayListTest().start();
	}
}
