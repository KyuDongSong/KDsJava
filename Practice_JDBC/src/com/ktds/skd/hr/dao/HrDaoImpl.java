package com.ktds.skd.hr.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ktds.skd.dao.support.JDBCDaoSupport;
import com.ktds.skd.dao.support.QueryHandler;
import com.ktds.skd.dao.support.annotation.BindData;
import com.ktds.skd.hr.vo.DepartmentsVO;
import com.ktds.skd.hr.vo.EmployeesVO;

public class HrDaoImpl extends JDBCDaoSupport implements HrDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeesVO> getDepartmentNameJobTtileAndCity() {

		return selectList(new QueryHandler() {

			@Override
			public String preparedQuery() {
				String query = "SELECT  D.DEPARTMENT_NAME " + "        , J.JOB_TITLE " + "        , L.CITY "
						+ " FROM    EMPLOYEES E " + "        , DEPARTMENTS D " + "        , LOCATIONS L "
						+ "        , JOBS J " + "WHERE   E.DEPARTMENT_ID = D.DEPARTMENT_ID "
						+ " AND     E.JOB_ID = J.JOB_ID " + " AND     D.LOCATION_ID = L.LOCATION_ID ";
				return query;
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {

			}

			@Override
			public Object getData(ResultSet rs) {
				EmployeesVO employeesVO = new EmployeesVO();

				BindData.bindData(rs, employeesVO);
				BindData.bindData(rs, employeesVO.getJobs());
				BindData.bindData(rs, employeesVO.getDepartments());
				BindData.bindData(rs, employeesVO.getDepartments().getLocations());

				return employeesVO;
			}

		});
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeesVO> getAllEmployeesInOneDepartment(int departmentId) {

		return selectList(new QueryHandler() {

			@Override
			public String preparedQuery() {
				String query = " SELECT  E.DEPARTMENT_ID " + "        , E.EMPLOYEE_ID " + " FROM    EMPLOYEES E "
						+ "        , DEPARTMENTS D " + " WHERE   E.DEPARTMENT_ID = D.DEPARTMENT_ID "
						+ " AND     E.DEPARTMENT_ID = ? ";
				return query;
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {
				stmt.setInt(1, departmentId);
			}

			@Override
			public Object getData(ResultSet rs) {
				EmployeesVO employeesVO = new EmployeesVO();
				BindData.bindData(rs, employeesVO);
				BindData.bindData(rs, employeesVO.getDepartments());
				return employeesVO;
			}

		});
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeesVO> getAllEmployeesWithDepartmentNameAndJobTitle() {

		return selectList(new QueryHandler() {

			@Override
			public String preparedQuery() {
				String query = "SELECT  L.CITY " + "        ,E.EMPLOYEE_ID " + "        , D.DEPARTMENT_NAME "
						+ "        , J.JOB_TITLE " + "        , E.FIRST_NAME " + "        , E.LAST_NAME "
						+ "        , E.EMAIL " + "        , E.PHONE_NUMBER " + "        , E.HIRE_DATE "
						+ "        , E.JOB_ID " + "        , E.SALARY " + "        , E.COMMISSION_PCT "
						+ "        , E.MANAGER_ID " + "FROM    EMPLOYEES E " + "        , DEPARTMENTS D "
						+ "        , LOCATIONS L " + "        , JOBS J " + "WHERE   E.JOB_ID = J.JOB_ID "
						+ "AND     E.DEPARTMENT_ID = D.DEPARTMENT_ID " + "AND     D.LOCATION_ID = L.LOCATION_ID "
						+ "AND     L.CITY LIKE 'Seattle' ";
				return query;
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {

			}

			@Override
			public Object getData(ResultSet rs) {
				EmployeesVO employeesVO = new EmployeesVO();
				BindData.bindData(rs, employeesVO);
				BindData.bindData(rs, employeesVO.getDepartments());
				BindData.bindData(rs, employeesVO.getDepartments().getLocations());
				BindData.bindData(rs, employeesVO.getJobs());
				return employeesVO;
			}

		});
	}
}
