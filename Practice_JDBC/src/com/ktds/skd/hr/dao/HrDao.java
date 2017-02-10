package com.ktds.skd.hr.dao;

import java.util.List;

import com.ktds.skd.hr.vo.DepartmentsVO;
import com.ktds.skd.hr.vo.EmployeesVO;

public interface HrDao {

	public List<EmployeesVO> getDepartmentNameJobTtileAndCity();

	public List<EmployeesVO> getAllEmployeesInOneDepartment(int departmentId);

	public List<EmployeesVO> getAllEmployeesWithDepartmentNameAndJobTitle();

}
