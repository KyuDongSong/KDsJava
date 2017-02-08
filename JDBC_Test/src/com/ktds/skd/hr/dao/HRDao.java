package com.ktds.skd.hr.dao;

import java.util.List;

import com.ktds.skd.hr.vo.EmployeesVO;

public interface HRDao {

	public List<EmployeesVO> getAllEmployees();

	public List<EmployeesVO> getJoinEmployeesDepartments();

	public List<EmployeesVO> getJoinEmployeesDepartmentsJobs();

}
