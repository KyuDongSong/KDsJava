package com.ktds.skd.homework.biz;

import java.util.List;
import java.util.Scanner;

import com.ktds.skd.homework.dao.AdminDao;
import com.ktds.skd.homework.dao.AdminDaoImpl;
import com.ktds.skd.homework.vo.AdminVO;
import com.ktds.skd.homework.vo.GradeVO;

public class AdminBizImpl implements AdminBiz {

	private AdminDao adminDao;

	Scanner input = new Scanner(System.in);

	public AdminBizImpl() {
		adminDao = new AdminDaoImpl();
	}

	@Override
	public void showAllStaff() {
		List<AdminVO> staffList = adminDao.showAllStaff();

		for (AdminVO admin : staffList) {
			System.out.println("이름: " + admin.getName() + "부서: " + admin.getPart() + "직급: " + admin.getGrade() + "연봉: "
					+ admin.getSalary());
		}
	}

	@Override
	public void addStaff() {
		System.out.println("사원 정보 입력");

		System.out.print("이름: ");
		String tempName = input.next();

		System.out.println("부서: ");
		String tempPart = input.next();

		System.out.println("직급(사원/대리/과장/차장/부장/사장): ");
		String tempGrade = input.next();

		System.out.println("연봉");
		int tempSalary = input.nextInt();

		AdminVO adminVO = new AdminVO();

		adminVO.setName(tempName);
		adminVO.setPart(tempPart);
		adminVO.setGrade(tempGrade);
		adminVO.setSalary(tempSalary);

		adminDao.addStaff(adminVO);

	}

	@Override
	public void removeStaff() {
		System.out.println("삭제할 사원의 번호를 입력하세요.");
		int staffNumber = input.nextInt();

		adminDao.removeStaff(staffNumber);
	}

	@Override
	public void promote() { 
		System.out.print("승진할 사원의 번호를 입력하세요.");
		int staffNumber = input.nextInt();

		GradeVO gradeVO = gradeDao.findStaffNumber(staffNumber);

		String grade = gradeDao.

		if (grade == gradeVO.BOSS) {
			System.out.println("사장님.. 진급할 수 없습니다..");
		} else if (grade == gradeVO.WORKER) {
			gradeVO.setGrade(gradeVO.MANAGER);
		} else if (grade == gradeVO.MANAGER) {
			adminVO.setGrade(gradeVO.TEAM_CHIEF);
		} else if (grade == gradeVO.TEAM_CHIEF) {
			adminVO.setGrade(gradeVO.DEPART_CHIEF);
		} else if (grade == gradeVO.DEPART_CHIEF) {
			adminVO.setGrade(gradeVO.HEAD_CHIEF);
		} else if (grade == gradeVO.HEAD_CHIEF) {
			adminVO.setGrade(gradeVO.BOSS);
		}

	}

}
