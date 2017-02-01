package com.ktds.skd.address.book;

import java.util.List;
import java.util.Scanner;

import com.ktds.skd.address.book.biz.AddressBiz;
import com.ktds.skd.address.book.biz.AddressBizImpl;
import com.ktds.skd.address.book.vo.AddressVO;

public class Main {

	AddressBiz addressBiz = new AddressBizImpl();

	public void start() {

		Scanner input = new Scanner(System.in);

		int chooseMenu = 0;

		List<AddressVO> addressList = null;
		int addressNumber = 0;
		AddressVO addressVO = null;

		String nameTemp = "";
		String phoneNumberTemp = "";
		String addressTemp = "";

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
				addressList = addressBiz.queryAllList();
				for (AddressVO address : addressList) {
					System.out.printf("이름 : %s, 전화번호 : %s, 주소 : %s\n", address.getName(), address.getPhoneNumber(),
							address.getAddress());
				}
			} else if (chooseMenu == 2) {
				System.out.println("검색할 주소록의 번호를 입력하세요.");
				addressNumber = input.nextInt();

				addressVO = addressBiz.findOneAddress(addressNumber);
				System.out.printf("이름 : %s, 전화번호 : %s, 주소 : %s\n", addressVO.getName(), addressVO.getPhoneNumber(),
						addressVO.getAddress());

			} else if (chooseMenu == 3) {
				System.out.println("삭제할 주소록의 번호를 입력하세요.");
				addressNumber = input.nextInt();

				addressBiz.removeAddress(addressNumber);
			} else if (chooseMenu == 4) {
				System.out.println("수정할 주소록의 번호를 입력하세요.");
				addressNumber = input.nextInt();

				addressVO = addressBiz.findOneAddress(addressNumber);
				System.out.printf("이름 : %s, 전화번호 : %s, 주소 : %s\n", addressVO.getName(), addressVO.getPhoneNumber(),
						addressVO.getAddress());

				System.out.println("새로운 주소 정보 입력");
				System.out.print("이름: ");
				nameTemp = input.nextLine();
				System.out.print("전화 번호: ");
				phoneNumberTemp = input.nextLine();
				System.out.print("주소: ");
				addressTemp = input.nextLine();

				addressVO = new AddressVO();
				addressVO.setName(nameTemp);
				addressVO.setPhoneNumber(phoneNumberTemp);
				addressVO.setAddress(addressTemp);

				addressBiz.addAddress(addressVO);

			} else if (chooseMenu == 5) {

				System.out.println("새로운 주소 정보 입력");
				System.out.print("이름: ");
				nameTemp = input.next();
				System.out.print("전화 번호: ");
				phoneNumberTemp = input.next();
				System.out.print("주소: ");
				addressTemp = input.next();

				addressVO = new AddressVO();
				addressVO.setName(nameTemp);
				addressVO.setPhoneNumber(phoneNumberTemp);
				addressVO.setAddress(addressTemp);

				addressBiz.addAddress(addressVO);
			} else {
				break;
			}
		}

	}

	public static void main(String[] args) {
		new Main().start();
	}
}
