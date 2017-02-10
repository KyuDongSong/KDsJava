package com.ktds.skd.hr.biz;

import java.util.List;

import com.ktds.skd.hr.dao.HrDao;
import com.ktds.skd.hr.dao.HrDaoImpl;
import com.ktds.skd.hr.vo.EmployeesVO;

public class HrBizImpl implements HrBiz {

	HrDao hrDao = new HrDaoImpl();

	@Override
	public void showDepartmentNameJobTtileAndCity() {
		List<EmployeesVO> allEmployees = hrDao.getDepartmentNameJobTtileAndCity();

		for (EmployeesVO employeesVO : allEmployees)
			System.out.printf("%s\t %s\t %s\t\n", employeesVO.getDepartments().getDepartmentName(),
					employeesVO.getJobs().getJobTitle(), employeesVO.getDepartments().getLocations().getCity());
	}

	@Override
	public void showAllStaffInOneDepartment(int departmentId) {
		List<EmployeesVO> allEmployees = hrDao.getAllEmployeesInOneDepartment(departmentId);

		for (EmployeesVO employeesVO : allEmployees) {
			System.out.printf("%d\t %d\t\n", employeesVO.getDepartmentId(), employeesVO.getEmployeeId());
		}
	}

	@Override
	public void showAllEmployeesWithDepartmentNameAndJobTitle() {
		List<EmployeesVO> allEmployees = hrDao.getAllEmployeesWithDepartmentNameAndJobTitle();

		for (EmployeesVO employeesVO : allEmployees) {
			System.out.printf("%s\t %d\t %s\t %s\t %s\t %s\t %s\t %s\t %s\t %s\t %d\t %f\t %d\n",
					employeesVO.getDepartments().getLocations().getCity(), employeesVO.getEmployeeId(),
					employeesVO.getDepartments().getDepartmentName(), employeesVO.getJobs().getJobTitle(),
					employeesVO.getFirstName(), employeesVO.getLastName(), employeesVO.geteMail(),
					employeesVO.getPhoneNumber(), employeesVO.getHireDate(), employeesVO.getJobId(),
					employeesVO.getSalary(), employeesVO.getCommissionPct(), employeesVO.getManagerId());
		}

	}

}
