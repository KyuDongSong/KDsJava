package com.ktds.skd.hr.vo;

public class DepartmentsVO {

	public int departmentId;

	public String departmentName;

	public int managerId;

	public int locationId;

	public LocationsVO loations;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
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

	public LocationsVO getLoations() {
		return loations;
	}

	public void setLoations(LocationsVO loations) {
		this.loations = loations;
	}

}
