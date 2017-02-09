package com.ktds.skd.hr.biz;

public interface HRBiz {

	public void printAllEmployees();

	public void printAllEmployeesWithDepartments();

	public void printAllEmployeesWithDepartmentsAndJobs();

	public void printOneEmployees(int employeeId);

	public void printAllDepartmentsWithLocations();

	public void printAllCountriesWithRegions();
}
