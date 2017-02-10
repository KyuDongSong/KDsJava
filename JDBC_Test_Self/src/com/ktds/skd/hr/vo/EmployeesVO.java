package com.ktds.skd.hr.vo;

import com.ktds.skd.dao.support.annotation.Types;

public class EmployeesVO {

	@Types
	public int employeeId;

	@Types
	public int salary;

	@Types
	public int commissionPct;

	@Types
	public int managerId;

	@Types
	public int departmentId;

	@Types
	public String firstName;

	@Types
	public String lastName;

	@Types
	public String eMail;

	@Types
	public String phoneNumber;

	@Types
	public String hireData;

	@Types
	public String jobId;

	public DepartmentsVO departments;
	public JobsVO jobs;

	public DepartmentsVO getDepartmentsVO() {
		if (departments == null) {
			departments = new DepartmentsVO();
		}
		return departments;
	}

	public void setDepartmentsVO(DepartmentsVO departmentsVO) {
		this.departments = departmentsVO;
	}

	public JobsVO getJobs() {
		if (jobs == null) {
			jobs = new JobsVO();
		}
		return jobs;
	}

	public void setJobs(JobsVO jobs) {
		this.jobs = jobs;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommissionPct() {
		return commissionPct;
	}

	public void setCommissionPct(int commissionPct) {
		this.commissionPct = commissionPct;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHireData() {
		return hireData;
	}

	public void setHireData(String hireData) {
		this.hireData = hireData;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

}
