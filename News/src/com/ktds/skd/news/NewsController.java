package com.ktds.skd.news;

import java.util.Scanner;

import com.ktds.skd.news.biz.NewsBiz;
import com.ktds.skd.news.biz.NewsBizImpl;

public class NewsController {

	public void start() {
		NewsBiz newsBiz = new NewsBizImpl();

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int choice = 0;

		while (choice != 3) {
			System.out.println("1. 전체 기사 조회 / 2. 기사 등록 / 3. 종료");
			choice = input.nextInt();

			if (choice == 1) {
				newsBiz.queryAllNews();
			} else if (choice == 2) {
				newsBiz.addNewsNews();
			} else if (choice == 3) {
				System.out.println("bye~");
				break;
			} else {
				System.out.println("Wrong Input!!(input 1/2/3)");
				choice = 0;
			}
		}
	}

	public static void main(String[] args) {
		new NewsController().start();
	}
}
