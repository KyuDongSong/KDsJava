package com.ktds.skd.address.book;

import java.util.List;
import java.util.Scanner;

import com.ktds.skd.address.book.biz.AddressBiz;
import com.ktds.skd.address.book.biz.AddressBizImpl;
import com.ktds.skd.address.book.dao.AddressDao;
import com.ktds.skd.address.book.dao.AddressDaoImpl;
import com.ktds.skd.address.book.vo.AddressVO;

public class AddressController {

	public void start() {

		AddressBiz addressBiz = new AddressBizImpl();

		Scanner input = new Scanner(System.in);
		int chooseMenu = 0;

		while (true) {
			System.out.println("=========== Address Book System ===========");
			System.out.println("1. 조회");
			System.out.println("2. 검색");
			System.out.println("3. 삭제");
			System.out.println("4. 수정");
			System.out.println("5. 추가");
			System.out.println("===========================================");
			System.out.println("메뉴 선택");

			chooseMenu = input.nextInt();
			if (chooseMenu == 1) {
				addressBiz.queryAllList();
			} else if (chooseMenu == 2) {
				addressBiz.findOneAddress();
			} else if (chooseMenu == 3) {
				addressBiz.removeAddress();
			} else if (chooseMenu == 4) {
				addressBiz.updateAddress();
			} else if (chooseMenu == 5) {
				addressBiz.addAddress();
			} else {
				break;
			}
		}

	}

	public static void main(String[] args) {
		new AddressController().start();
	}
}
