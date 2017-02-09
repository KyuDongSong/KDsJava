package com.ktds.skd.hr.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ktds.skd.dao.support.JDBCDaoSupport;
import com.ktds.skd.dao.support.QueryHandler;
import com.ktds.skd.dao.support.annotation.BindData;
import com.ktds.skd.hr.vo.CountriesVO;
import com.ktds.skd.hr.vo.DepartmentsVO;
import com.ktds.skd.hr.vo.EmployeesVO;

public class HRDaoImpl extends JDBCDaoSupport implements HRDao {

	@SuppressWarnings("unchecked")
		
	@Override
	public List<EmployeesVO> getAllEmployees() {

		// 인터페이스의 객체화 (익명클래스 - anonymous class)
		return selectList(new QueryHandler() {

			@Override
			public String preparedQuery() {
				String query = " SELECT  " + " EMPLOYEE_ID, FIRST_NAME, LAST_NAME,  "
						+ "   EMAIL, PHONE_NUMBER, HIRE_DATE,  " + "   JOB_ID, SALARY, COMMISSION_PCT,  "
						+ "   MANAGER_ID, DEPARTMENT_ID " + " FROM HR.EMPLOYEES ";
				return query;
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {

			}

			@Override
			public Object getData(ResultSet rs) {
				EmployeesVO employeesVO = new EmployeesVO();
				BindData.bindData(rs, employeesVO);
				return employeesVO;
			}

		});
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeesVO> getJoinEmployeesDepartments() {

		return selectList(new QueryHandler() {

			@Override
			public String preparedQuery() {
				String query = " SELECT  " + " E.EMPLOYEE_ID, E.FIRST_NAME, E.LAST_NAME,  "
						+ "   E.EMAIL, E.PHONE_NUMBER, E.HIRE_DATE,  " + "   E.JOB_ID, E.SALARY, E.COMMISSION_PCT,  "
						+ "   E.MANAGER_ID, " + " E.DEPARTMENT_ID E_DEPARTMENT_ID, "
						+ "D.DEPARTMENT_ID D_DEPARTMENT_ID, " + " D.DEPARTMENT_NAME, " + " D.MANAGER_ID D_MANAGER_ID, "
						+ "D.LOCATION_ID " + " FROM HR.EMPLOYEES E, " + " DEPARTMENTS D "
						+ " WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID ";
				return query;
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {
			}

			@Override
			public Object getData(ResultSet rs) {
				EmployeesVO employeesVO = new EmployeesVO();
				BindData.bindData(rs, employeesVO);
				return employeesVO;
			}

		});
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeesVO> getJoinEmployeesDepartmentsJobs() {

		return selectList(new QueryHandler() {

			@Override
			public String preparedQuery() {
				String query = "SELECT  E.EMPLOYEE_ID  " + "        , E.FIRST_NAME  " + "        , E.LAST_NAME  "
						+ "        , E.EMAIL  " + "        , E.PHONE_NUMBER  " + "        , E.HIRE_DATE  "
						+ "        , E.JOB_ID  " + "        , E.SALARY  " + "        , E.COMMISSION_PCT  "
						+ "        , E.MANAGER_ID  " + "        , E.DEPARTMENT_ID  " + "FROM    EMPLOYEES E  "
						+ "        , DEPARTMENTS D  " + "        , JOBS J  "
						+ "WHERE   E.DEPARTMENT_ID = D.DEPARTMENT_ID " + "AND     E.JOB_ID = J.JOB_ID  ";

				return query;
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {

			}

			@Override
			public Object getData(ResultSet rs) {
				EmployeesVO employeesVO = new EmployeesVO();
				BindData.bindData(rs, employeesVO);
				return employeesVO;
			}

		});
	}

	@Override
	public EmployeesVO findOneEmployee(int employeeId) {

		return (EmployeesVO) selectOne(new QueryHandler() {

			@Override
			public String preparedQuery() {
				StringBuffer query = new StringBuffer();
				query.append(" SELECT	EMPLOYEE_ID ");
				query.append(" 			, FIRST_NAME ");
				query.append(" 			, LAST_NAME ");
				query.append(" 			, EMAIL ");
				query.append(" 			, PHONE_NUMBER ");
				query.append(" 			, JOB_ID ");
				query.append(" 			, HIRE_DATE ");
				query.append(" 			, SALARY ");
				query.append(" 			, COMMISSION_PCT ");
				query.append(" 			, MANAGER_ID ");
				query.append(" 			, DEPARTMENT_ID ");
				query.append(" FROM  	EMPLOYEES ");
				query.append(" WHERE  	EMPLOYEE_ID = ? ");
				return query.toString();
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {
				stmt.setInt(1, employeeId);
			}

			@Override
			public Object getData(ResultSet rs) {
				EmployeesVO employeesVO = new EmployeesVO();

				BindData.bindData(rs, employeesVO);
				return employeesVO;
			}

		});
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DepartmentsVO> getJoinDepartmentsWithLocations() {

		return selectList(new QueryHandler() {

			@Override
			public String preparedQuery() {
				String query = " SELECT  D.DEPARTMENT_ID  " + "        , D.DEPARTMENT_NAME  "
						+ "        , D.MANAGER_ID  " + "        , L.LOCATION_ID  " + "        , L.STREET_ADDRESS  "
						+ "        , L.POSTAL_CODE  " + "        , L.CITY  " + "        , L.STATE_PROVINCE  "
						+ "        , L.COUNTRY_ID  " + " FROM    LOCATIONS L  " + "        , DEPARTMENTS D  "
						+ " WHERE   D.LOCATION_ID = L.LOCATION_ID  ";
				return query;
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {

			}

			@Override
			public Object getData(ResultSet rs) {
				DepartmentsVO departmentVO = new DepartmentsVO();
				BindData.bindData(rs, departmentVO);
				return departmentVO;
			}

		});
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CountriesVO> getJoinCountriesWithRegions() {

		return selectList(new QueryHandler() {

			@Override
			public String preparedQuery() {
				String query = " SELECT C.COUNTRY_ID " + "        , C.COUNTRY_NAME " + "        , C.REGION_ID "
						+ "        , R.REGION_NAME " + " FROM    COUNTRIES C " + "        , REGIONS R "
						+ " WHERE   C.REGION_ID = R.REGION_ID ";
				return query;
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {

			}

			@Override
			public Object getData(ResultSet rs) {
				CountriesVO countriesVO = new CountriesVO();
				BindData.bindData(rs, countriesVO);
				return countriesVO;
			}

		});
	}
}
