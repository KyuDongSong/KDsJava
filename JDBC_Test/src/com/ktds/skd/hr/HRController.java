package com.ktds.skd.hr;

import com.ktds.skd.hr.biz.HRBiz;
import com.ktds.skd.hr.biz.HRBizImpl;

public class HRController {
	public void start(){
		HRBiz hrBiz = new HRBizImpl();
		
		hrBiz.printAllEmployeesWithDepartments();
		
	}
	
	public static void main(String[] args) {

		// HRBiz hrBiz = new HRBizImpl();
		//new HRBizImpl().printAllEmployees();
		//new HRBizImpl().printAllEmployeesWithDepartments();
		new HRController().start();
	}
}
