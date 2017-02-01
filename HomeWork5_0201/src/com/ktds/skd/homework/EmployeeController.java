package com.ktds.skd.homework;

import java.util.Scanner;

import com.ktds.skd.homework.biz.AdminBiz;
import com.ktds.skd.homework.biz.AdminBizImpl;

public class EmployeeController {

	public void start() {
		AdminBiz adminBiz = new AdminBizImpl();
		Scanner input = new Scanner(System.in);
		int choice = 0;

		while (choice != 5) {
			System.out.println("======== 사원 관리 시스템 ========");
			System.out.println("1. 전체 직원 조회 / 2. 직원 추가(입사) / 3. 직원 삭제(퇴사) / 4. 직원 수정(진급) / 5. 종료");
			choice = input.nextInt();

			if (choice == 1) {
				adminBiz.showAllStaff();
			} else if (choice == 2) {
				adminBiz.addStaff();
			} else if (choice == 3) {
				adminBiz.removeStaff();
			} else if (choice == 4) {
				adminBiz.promote();
			} else if (choice == 5) {
				break;
			} else {
				System.out.println("Wrong Input(Please Input 1,2,3,4,5)");
				choice = 0;
			}
		}
	}

	public static void main(String[] args) {
		new EmployeeController().start();
	}
}
