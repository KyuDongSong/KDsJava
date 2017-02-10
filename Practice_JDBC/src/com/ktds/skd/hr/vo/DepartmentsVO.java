package com.ktds.skd.hr.vo;

import java.util.List;

import com.ktds.skd.dao.support.annotation.Types;

public class DepartmentsVO {

	@Types
	private int departmentId;

	@Types
	private int managerId;

	@Types
	private int locationId;

	@Types
	private String departmentName;
	
	private List<EmployeesVO> employees;

	public List<EmployeesVO> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeesVO> employees) {
		this.employees = employees;
	}

	private LocationsVO locations;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public LocationsVO getLocations() {
		if (locations == null) {
			locations = new LocationsVO();
		}
		return locations;
	}

	public void setLocations(LocationsVO locations) {
		this.locations = locations;
	}

}
