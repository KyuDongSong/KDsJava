package com.ktds.skd.hr.vo;

public class EmployeesVO {
	private int employeeId;
	private int salary;
	private int managerId;
	private int departmentId;

	private String firstName;
	private String lastName;
	private String hireDate; // Date type�� String
	private String email;
	private String phoneNumber;
	private String jobId;

	private double commissionPct;

	private DepartmentsVO departments; // 한 사원이 부서의 정보를 가지고 있다. 조인표현 방법.
	private JobsVO jobs;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
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

	public double getCommissionPct() {
		return commissionPct;
	}

	public void setCommissionPct(double commissionPct) {
		this.commissionPct = commissionPct;
	}

	// 채이닝을 위해서 NULL 체크
	public DepartmentsVO getDepartments() {
		if (departments == null) {
			departments = new DepartmentsVO(); // 조인을 걸 getter한테.
		}
		return departments;
	}

	public void setDepartments(DepartmentsVO departments) {
		this.departments = departments;
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

}
