package com.ktds.skd.hr.biz;

import java.util.List;

import com.ktds.skd.hr.dao.HRDao;
import com.ktds.skd.hr.dao.HRDaoImpl;
import com.ktds.skd.hr.vo.CountriesVO;
import com.ktds.skd.hr.vo.DepartmentsVO;
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
	public void printAllEmployeesWithDepartmentsAndJobs() {
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

	@Override
	public void printOneEmployees(int employeeId) {
		EmployeesVO employees = hrDao.findOneEmployee(employeeId);
		System.out.printf("%d\t %s\t %s\t %f\t %d\t %s\t %s\t %s\t %d\t %s\t %d\n", employees.getEmployeeId(),
				employees.getFirstName(), employees.getLastName(), employees.getCommissionPct(),
				employees.getDepartmentId(), employees.getEmail(), employees.getHireDate(), employees.getJobId(),
				employees.getManagerId(), employees.getPhoneNumber(), employees.getSalary());
	}

	@Override
	public void printAllDepartmentsWithLocations() {
		List<DepartmentsVO> allDepartments = hrDao.getJoinDepartmentsWithLocations();

		for (DepartmentsVO departmentsVO : allDepartments) {
			System.out.printf("%d\t %s\t %d\t %d\t %d\t %s\t %s\t %s\t %s\t %s\n", departmentsVO.getDepartmentId(),
					departmentsVO.getDapartmentName(), departmentsVO.getManagerId(),
					departmentsVO.getLocationVO().getLocationId(), departmentsVO.getLocationVO().getStreetAddress(),
					departmentsVO.getLocationVO().getPodtalCode(), departmentsVO.getLocationVO().getCity(),
					departmentsVO.getLocationVO().getStateProvince(), departmentsVO.getLocationVO().getCountryId());

		}
	}

	@Override
	public void printAllCountriesWithRegions() {
		List<CountriesVO> allCountries = hrDao.getJoinCountriesWithRegions();

		for (CountriesVO countriesVO : allCountries) {
			System.out.printf("%s\t %s\t %d\t %s\n", countriesVO.getCountryId(), countriesVO.getCountryName(),
					countriesVO.getRegions().getRegionId(), countriesVO.getRegions().getRegionName());
		}
	}
}
