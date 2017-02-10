package com.ktds.skd.hr;

import com.ktds.skd.hr.biz.HrBiz;
import com.ktds.skd.hr.biz.HrBizImpl;

public class HRController {

	public void start() {
		HrBiz hrBiz = new HrBizImpl();

		// 사원들의 부서명, 직무명, 근무도시 조회
		//hrBiz.showDepartmentNameJobTtileAndCity();
		// 한 부서에서 일하는 모든 사원들 조회
		//hrBiz.showAllStaffInOneDepartment(20);
		
		// Seattle에서 근무하는 모든 사원들의 정보와 부서명, 직무명 조회
		hrBiz.showAllEmployeesWithDepartmentNameAndJobTitle();
	}

	public static void main(String[] args) {
		new HRController().start();
	}
}
