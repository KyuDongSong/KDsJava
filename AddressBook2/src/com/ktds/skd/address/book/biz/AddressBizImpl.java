package com.ktds.skd.address.book.biz;

import java.util.List;
import java.util.Scanner;

import com.ktds.skd.address.book.dao.AddressDao;
import com.ktds.skd.address.book.dao.AddressDaoImpl;
import com.ktds.skd.address.book.vo.AddressVO;

public class AddressBizImpl implements AddressBiz {

	private Scanner input = new Scanner(System.in);
	private AddressDao addressDao;

	public AddressBizImpl() {
		addressDao = new AddressDaoImpl();
	}

	@Override
	public void queryAllList() {
		List<AddressVO> addressList = addressDao.queryAllList();
		for (AddressVO address : addressList) {
			printAddressInfomation(address);
		}
	}

	private void printAddressInfomation(AddressVO address) {
		System.out.printf("이름 : %s, 전화번호 : %s, 주소 : %s\n", address.getName(), address.getPhoneNumber(),
				address.getAddress());
	}

	@Override
	public void findOneAddress() {

		System.out.println("검색할 주소록의 번호를 입력하세요.");
		int addressNumber = input.nextInt();

		AddressVO addressVO = addressDao.findOneAddress(addressNumber);
		printAddressInfomation(addressVO);

	}

	@Override
	public void removeAddress() {

		System.out.println("삭제할 주소록의 번호를 입력하세요.");
		int addressNumber = input.nextInt();

		addressDao.removeAddress(addressNumber);
	}

	@Override
	public void updateAddress() {

		System.out.println("수정할 주소록의 번호를 입력하세요.");
		int addressNumber = input.nextInt();

		AddressVO addressVO = addressDao.findOneAddress(addressNumber);
		printAddressInfomation(addressVO);

		addressVO = createNewAddress();

		addressDao.addAddress(addressVO);

	}

	private AddressVO createNewAddress() {
		System.out.println("새로운 주소 정보 입력");
		System.out.print("이름: ");
		String nameTemp = input.nextLine();

		System.out.print("전화 번호: ");
		String phoneNumberTemp = input.nextLine();

		System.out.print("주소: ");
		String addressTemp = input.nextLine();

		AddressVO addressVO;

		addressVO = new AddressVO();
		addressVO.setName(nameTemp);
		addressVO.setPhoneNumber(phoneNumberTemp);
		addressVO.setAddress(addressTemp);
		return addressVO;
	}

	@Override
	public void addAddress() {

		AddressVO addressVO = createNewAddress();

		addressDao.addAddress(addressVO);
	}

}
