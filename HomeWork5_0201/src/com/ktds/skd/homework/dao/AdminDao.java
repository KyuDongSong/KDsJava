package com.ktds.skd.homework.dao;

import java.util.List;

import com.ktds.skd.homework.vo.AdminVO;

public interface AdminDao {

	public List<AdminVO> showAllStaff();

	public void addStaff(AdminVO adminVO);
	
	public void removeStaff(int index);
	
	public AdminVO findStaffNumber(int index);
	
	public void promote(int index, AdminVO adminVO);
}
