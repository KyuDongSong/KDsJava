package com.ktds.skd.hr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ktds.skd.hr.vo.DepartmentsVO;
import com.ktds.skd.hr.vo.EmployeesVO;
import com.ktds.skd.hr.vo.JobsVO;

public class HRDaoImpl implements HRDao {

	@Override
	public List<EmployeesVO> getAllEmployees() {

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 오류.");
			return null;
		}

		Connection conn = null; // JAVA + ORACLE 연결 / 오라클 인스턴스 == 오라클 DB
		PreparedStatement stmt = null; // 쿼리를 만들어서 오라클에게 전달하는 역할 & 실행 객체
		ResultSet rs = null; // 결과를 받아옴.

		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleUrl, "HR", "hr");
			String query = " SELECT  " + " EMPLOYEE_ID, FIRST_NAME, LAST_NAME,  "
					+ "   EMAIL, PHONE_NUMBER, HIRE_DATE,  " + "   JOB_ID, SALARY, COMMISSION_PCT,  "
					+ "   MANAGER_ID, DEPARTMENT_ID " + " FROM HR.EMPLOYEES ";

			stmt = conn.prepareStatement(query);

			rs = stmt.executeQuery();

			EmployeesVO employeesVO = null;
			List<EmployeesVO> employees = new ArrayList<EmployeesVO>();
			while (rs.next()) {

				employeesVO = new EmployeesVO();
				employeesVO.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
				employeesVO.setCommissionPct(rs.getDouble("COMMISSION_PCT"));
				employeesVO.setDepartmentId(rs.getInt("DEPARTMENT_ID"));
				employeesVO.setEmail(rs.getString("EMAIL"));
				employeesVO.setFirstName(rs.getString("FIRST_NAME"));
				employeesVO.setHireDate(rs.getString("HIRE_DATE"));
				employeesVO.setJobId(rs.getString("JOB_ID"));
				employeesVO.setLastName(rs.getString("LAST_NAME"));
				employeesVO.setManagerId(rs.getInt("MANAGER_ID"));
				employeesVO.setPhoneNumber(rs.getString("PHONE_NUMBER"));
				employeesVO.setSalary(rs.getInt("SALARY"));

				employees.add(employeesVO);
			}

			return employees;

		} catch (SQLException e) {
			System.out.println("오라클 접속 에러");
			return null;
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
			}
		}

	}

	@Override
	public List<EmployeesVO> getJoinEmployeesDepartments() {

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 에러");
			return null;
		}

		Connection conn = null; // JAVA + ORACLE 연결 / 오라클 인스턴스 == 오라클 DB
		PreparedStatement stmt = null; // 쿼리를 만들어서 오라클에게 전달하는 역할 & 실행 객체
		ResultSet rs = null; // 결과를 받아옴.

		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleUrl, "HR", "hr");
			String query = " SELECT  " + " E.EMPLOYEE_ID, E.FIRST_NAME, E.LAST_NAME,  "
					+ "   E.EMAIL, E.PHONE_NUMBER, E.HIRE_DATE,  " + "   E.JOB_ID, E.SALARY, E.COMMISSION_PCT,  "
					+ "   E.MANAGER_ID, " + " E.DEPARTMENT_ID E_DEPARTMENT_ID, " + "D.DEPARTMENT_ID D_DEPARTMENT_ID, "
					+ " D.DEPARTMENT_NAME, " + " D.MANAGER_ID D_MANAGER_ID, " + "D.LOCATION_ID "
					+ " FROM HR.EMPLOYEES E, " + " DEPARTMENTS D " + " WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID ";

			stmt = conn.prepareStatement(query);

			rs = stmt.executeQuery();

			EmployeesVO employeesVO = null;
			List<EmployeesVO> employees = new ArrayList<EmployeesVO>();
			while (rs.next()) {

				employeesVO = new EmployeesVO();
				employeesVO.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
				employeesVO.setCommissionPct(rs.getDouble("COMMISSION_PCT"));
				employeesVO.setDepartmentId(rs.getInt("E_DEPARTMENT_ID"));

				employeesVO.setEmail(rs.getString("EMAIL"));
				employeesVO.setFirstName(rs.getString("FIRST_NAME"));
				employeesVO.setHireDate(rs.getString("HIRE_DATE"));
				employeesVO.setJobId(rs.getString("JOB_ID"));
				employeesVO.setLastName(rs.getString("LAST_NAME"));
				employeesVO.setManagerId(rs.getInt("MANAGER_ID"));
				employeesVO.setPhoneNumber(rs.getString("PHONE_NUMBER"));
				employeesVO.setSalary(rs.getInt("SALARY"));

				// .으로 연결 : 데이터 채이닝 채이닝을 하기 때문에 getter에서 null인지
				// 아닌지 체크하는 if 구현
				// 채이닝은 한 스텝 정도로만.. ! 끊는다는 의미는?
				// 채이닝이 너무 길면 객체로 빼서 정리하기.
				DepartmentsVO departmentsVO = null;
				departmentsVO = employeesVO.getDepartments();
				departmentsVO.setDepartmentId(rs.getInt("D_DEPARTMENT_ID"));
				// employeesVO.getDepartments().setDepartmentId(rs.getInt("D_DEPARTMENT_ID"));
				departmentsVO.setDapartmentName(rs.getString("DEPARTMENT_NAME"));
				departmentsVO.setManagerId(rs.getInt("MANAGER_ID"));
				departmentsVO.setLocationId(rs.getInt("LOCATION_ID"));

				employees.add(employeesVO);
			}

			return employees;

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("오라클 접속 에러");
			return null;
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
			}
		}

	}

	@Override
	public List<EmployeesVO> getJoinEmployeesDepartmentsJobs() {

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 에러");
			return null;
		}

		Connection conn = null; // JAVA + ORACLE 연결 / 오라클 인스턴스 == 오라클 DB
		PreparedStatement stmt = null; // 쿼리를 만들어서 오라클에게 전달하는 역할 & 실행 객체
		ResultSet rs = null; // 결과를 받아옴.

		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleUrl, "HR", "hr");
			String query = "SELECT  E.EMPLOYEE_ID " + "        , E.FIRST_NAME " + "        , E.LAST_NAME "
					+ "        , E.EMAIL " + "        , E.PHONE_NUMBER " + "        , E.HIRE_DATE "
					+ "        , E.JOB_ID " + "        , E.SALARY " + "        , E.COMMOSSION_PCT "
					+ "        , E.MANAGER_ID " + "        , E.DEPARTMENT_ID " + "FROM    EMPLOYEES E "
					+ "        , DEPARTMENTS D " + "        , JOBS J " + "WHERE   E.DEPARTMENT_ID = D.DEPARTMENT_ID "
					+ "AND     E.JOB_ID = J.JOB_ID ";

			stmt = conn.prepareStatement(query);

			rs = stmt.executeQuery();

			EmployeesVO employeesVO = null;
			List<EmployeesVO> employees = new ArrayList<EmployeesVO>();
			while (rs.next()) {

				employeesVO = new EmployeesVO();
				employeesVO.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
				employeesVO.setCommissionPct(rs.getDouble("COMMISSION_PCT"));
				employeesVO.setDepartmentId(rs.getInt("E_DEPARTMENT_ID"));

				employeesVO.setEmail(rs.getString("EMAIL"));
				employeesVO.setFirstName(rs.getString("FIRST_NAME"));
				employeesVO.setHireDate(rs.getString("HIRE_DATE"));
				employeesVO.setJobId(rs.getString("JOB_ID"));
				employeesVO.setLastName(rs.getString("LAST_NAME"));
				employeesVO.setManagerId(rs.getInt("MANAGER_ID"));
				employeesVO.setPhoneNumber(rs.getString("PHONE_NUMBER"));
				employeesVO.setSalary(rs.getInt("SALARY"));

				// .으로 연결 : 데이터 채이닝 채이닝을 하기 때문에 getter에서 null인지
				// 아닌지 체크하는 if 구현
				// 채이닝은 한 스텝 정도로만.. ! 끊는다는 의미는?
				// 채이닝이 너무 길면 객체로 빼서 정리하기.
				DepartmentsVO departmentsVO = null;
				departmentsVO = employeesVO.getDepartments();
				departmentsVO.setDepartmentId(rs.getInt("D_DEPARTMENT_ID"));
				// employeesVO.getDepartments().setDepartmentId(rs.getInt("D_DEPARTMENT_ID"));
				departmentsVO.setDapartmentName(rs.getString("DEPARTMENT_NAME"));
				departmentsVO.setManagerId(rs.getInt("MANAGER_ID"));
				departmentsVO.setLocationId(rs.getInt("LOCATION_ID"));

				JobsVO jobsVO = null;
				jobsVO = employeesVO.getJobs();
				jobsVO.setJobId(rs.getString("J_JOB_ID"));
				jobsVO.setJobTitle(rs.getString("JOB_TITLE"));
				jobsVO.setMinSalary(rs.getInt("MIN_SALARY"));
				jobsVO.setMaxSalary(rs.getInt("MAX_SALARY"));

				employees.add(employeesVO);
			}

			return employees;

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("오라클 접속 에러");
			return null;
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
			}
		}

	}

}
