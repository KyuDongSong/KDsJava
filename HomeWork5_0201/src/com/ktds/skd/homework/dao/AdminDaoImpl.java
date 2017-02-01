package com.ktds.skd.homework.dao;

import java.util.ArrayList;
import java.util.List;

import com.ktds.skd.homework.vo.AdminVO;

public class AdminDaoImpl implements AdminDao {

	private List<AdminVO> staffList;

	public AdminDaoImpl() {
		staffList = new ArrayList<AdminVO>();
	}

	@Override
	public List<AdminVO> showAllStaff() {
		return staffList;
	}

	@Override
	public void addStaff(AdminVO adminVO) {
		staffList.add(adminVO);
	}

	@Override
	public void removeStaff(int index) {
		staffList.remove(index);
	}

	@Override
	public AdminVO findStaffNumber(int index) {
		return staffList.get(index);
	}

	@Override
	public void promote(int index, AdminVO adminVO) {
		staffList.set(index, adminVO);
		
	}


}
