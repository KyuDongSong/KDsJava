package com.ktds.skd.hr.vo;

import com.ktds.skd.dao.support.annotation.Types;

public class DepartmentsVO {

	@Types(alias = "D_DEPARTMENT_ID")
	private int departmentId;

	@Types
	private String dapartmentName;

	@Types(alias = "D_MANAGER_ID")
	private int managerId;

	@Types
	private int locationId;

	private LocationVO locations;

	public LocationVO getLocationVO() {
		if (locations == null) {
			locations = new LocationVO();
		}
		return locations;
	}

	public void setLocationVO(LocationVO locationVO) {
		this.locations = locationVO;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDapartmentName() {
		return dapartmentName;
	}

	public void setDapartmentName(String dapartmentName) {
		this.dapartmentName = dapartmentName;
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

}