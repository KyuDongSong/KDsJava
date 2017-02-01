package com.ktds.skd.address.book.biz;

import java.util.List;

import com.ktds.skd.address.book.vo.AddressVO;

public interface AddressBiz {

	/**
	 * 주소록 조회
	 */
	public void queryAllList();

	/**
	 * 주소 검색
	 */
	public void findOneAddress();

	/**
	 * 주소 삭제
	 */
	public void removeAddress();

	/**
	 * 주소 수젇
	 */
	public void updateAddress();

	/**
	 * 주소 추가
	 */
	public void addAddress();
}
