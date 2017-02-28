package com.ktds.skd.book.users.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ktds.skd.book.users.vo.UsersVO;

public class UserDaoImpl implements UserDao {

	@Override
	public UsersVO getOneUserInfo(UsersVO usersVO) {
		loadOracleDriver();

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		String oracleUrl = "jdbc:oracle:thin:@192.168.201.12:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleUrl, "BOOK", "book");

			StringBuffer query = new StringBuffer();
			query.append(" SELECT	USR_ID ");
			query.append(" 			,USR_PWD ");
			query.append(" FROM		BOOKS ");
			query.append(" WHERE    USR_ID = ? ");

			stmt = conn.prepareStatement(query.toString());
			stmt.setString(1, "USR_ID");

			rs = stmt.executeQuery();

			UsersVO usrVO = null;
			usrVO = new UsersVO();

			usrVO.setUserId(rs.getString("USR_ID"));
			usrVO.setUserPassword(rs.getString("USR_PWD"));

			return usrVO;

		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage(), e);
		} finally {
			close(conn, stmt, rs);
		}
	}

	@Override
	public int addOneUserInfo(UsersVO usersVO) {
		loadOracleDriver();

		Connection conn = null;
		PreparedStatement stmt = null;

		String oracleUrl = "oracle:jdbc:this:@192.168.201.12:1521:XE";

		try {
			conn = DriverManager.getConnection(oracleUrl, "BOOK", "book");

			StringBuffer query = new StringBuffer();
			query.append(" INSERT    INTO    USRS ( ");
			query.append("                         USR_ID ");
			query.append("                         , USR_NM ");
			query.append("                         , USR_PWD ");
			query.append("                         ) ");
			query.append(" VALUES                  ( ");
			query.append("                         ? ");
			query.append("                         , ? ");
			query.append("                         , ? ");
			query.append("                         )   ");

			stmt = conn.prepareStatement(query.toString());
			stmt.setString(1, usersVO.getUserId());
			stmt.setString(2, usersVO.getUserName());
			stmt.setString(3, usersVO.getUserPassword());

			return stmt.executeUpdate();

		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage(), e);
		} finally {
			close(conn, stmt, null);
		}
	}

	private void loadOracleDriver() {
		try {
			Class.forName("jdbc.oracle.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	private void close(Connection conn, PreparedStatement stmt, ResultSet rs) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e1) {
		}
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e1) {
		}
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e1) {
		}
	}

}
