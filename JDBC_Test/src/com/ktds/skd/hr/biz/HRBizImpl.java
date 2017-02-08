package com.ktds.skd.hr.biz;

import java.util.List;

import com.ktds.skd.hr.dao.HRDao;
import com.ktds.skd.hr.dao.HRDaoImpl;
import com.ktds.skd.hr.vo.EmployeesVO;

public class HRBizImpl implements HRBiz {

	private HRDao hrDao;

	public HRBizImpl() {
		hrDao = new HRDaoImpl();
	}

	@Override
	public void printAllEmployees() {
		List<EmployeesVO> allEmployees = hrDao.getAllEmployees();

		for (EmployeesVO employeesVO : allEmployees) {
			System.out.printf("%d\t%s\t%s\t%.2f\t%d\t%s\t%s\t%s\t%d\t%s\t%d\n", employeesVO.getEmployeeId(),
					employeesVO.getFirstName(), employeesVO.getLastName(), employeesVO.getCommissionPct(),
					employeesVO.getDepartmentId(), employeesVO.getEmail(), employeesVO.getHireDate(),
					employeesVO.getJobId(), employeesVO.getManagerId(), employeesVO.getPhoneNumber(),
					employeesVO.getSalary());
		}

	}

	@Override
	public void printAllEmployeesWithDepartments() {
		List<EmployeesVO> allEmployees = hrDao.getJoinEmployeesDepartments();
		// 채이닝 분리하기
		for (EmployeesVO employeesVO : allEmployees) {
			System.out.printf("%d\t%s\t%s\t%.2f\t%d\t%s\t%s\t%s\t%d\t%s\t%d\t%d\t%s\t%d\t%d\n",
					employeesVO.getEmployeeId(), employeesVO.getFirstName(), employeesVO.getLastName(),
					employeesVO.getCommissionPct(), employeesVO.getDepartmentId(), employeesVO.getEmail(),
					employeesVO.getHireDate(), employeesVO.getJobId(), employeesVO.getManagerId(),
					employeesVO.getPhoneNumber(), employeesVO.getSalary(),
					employeesVO.getDepartments().getDepartmentId(), employeesVO.getDepartments().getDapartmentName(),
					employeesVO.getDepartments().getManagerId(), employeesVO.getDepartments().getLocationId());
		}

	}

	@Override
	public void printAllEmployessWithDepartmentsAndJobs() {
		List<EmployeesVO> allEmployees = hrDao.getJoinEmployeesDepartmentsJobs();
		// 채이닝 분리하기
		for (EmployeesVO employeesVO : allEmployees) {
			System.out.printf("%d\t%s\t%s\t%.2f\t%d\t%s\t%s\t%s\t%d\t%s\t%d\t%d\t%s\t%d\t%d\t%s\t%s\t%d\t%d\t\n",
					employeesVO.getEmployeeId(), employeesVO.getFirstName(), employeesVO.getLastName(),
					employeesVO.getCommissionPct(), employeesVO.getDepartmentId(), employeesVO.getEmail(),
					employeesVO.getHireDate(), employeesVO.getJobId(), employeesVO.getManagerId(),
					employeesVO.getPhoneNumber(), employeesVO.getSalary(),
					employeesVO.getDepartments().getDepartmentId(), employeesVO.getDepartments().getDapartmentName(),
					employeesVO.getDepartments().getManagerId(), employeesVO.getDepartments().getLocationId(),
					employeesVO.getJobs().getJobId(), employeesVO.getJobs().getJobTitle(),
					employeesVO.getJobs().getMinSalary(), employeesVO.getJobs().getMaxSalary());
		}
	}

}
