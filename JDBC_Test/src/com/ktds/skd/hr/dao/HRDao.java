package com.ktds.skd.hr.dao;

import java.util.List;

import com.ktds.skd.hr.vo.CountriesVO;
import com.ktds.skd.hr.vo.DepartmentsVO;
import com.ktds.skd.hr.vo.EmployeesVO;

public interface HRDao {

	public List<EmployeesVO> getAllEmployees();

	public List<EmployeesVO> getJoinEmployeesDepartments();

	public List<EmployeesVO> getJoinEmployeesDepartmentsJobs();

	// query에 변수를 사용해서 data 받아오기
	public EmployeesVO findOneEmployee(int employeeId);

	public List<DepartmentsVO> getJoinDepartmentsWithLocations();

	public List<CountriesVO> getJoinCountriesWithRegions();

}
