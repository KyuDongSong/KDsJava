package com.ktds.skd.hr;

import com.ktds.skd.hr.biz.HRBiz;
import com.ktds.skd.hr.biz.HRBizImpl;

public class HRController {
	public void start() {
		HRBiz hrBiz = new HRBizImpl();

		//hrBiz.printAllEmployees();
		// hrBiz.printAllEmployeesWithDepartments();
		// hrBiz.printAllDepartmentsWithLocations();
		// hrBiz.printAllCountriesWithRegions();
		// hrBiz.printOneEmployees(200);
		//hrBiz.printAllEmployeesWithDepartmentsAndJobs();

	}

	public static void main(String[] args) {

		new HRController().start();
	}
}
