package com.ktds.skd.board.board.user.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ktds.skd.board.board.user.vo.UsersVO;
import com.ktds.skd.dao.support.JDBCDaoSupport;
import com.ktds.skd.dao.support.QueryHandler;
import com.ktds.skd.dao.support.annotation.BindData;

public class UserDaoImpl extends JDBCDaoSupport implements UserDao {

	@Override
	public int addMemberInfo(UsersVO usersVO) {
		return update(new QueryHandler() {

			@Override
			public String preparedQuery() {
				StringBuffer query = new StringBuffer();

				query.append(" INSERT	INTO	USRS ( ");
				query.append("                         USR_ID ");
				query.append("                         , USR_PWD ");
				query.append("                         , USR_NM ");
				query.append("                         , JOIN_DT ");
				query.append("                         ) ");
				query.append(" VALUES            ( ");
				query.append("                    ? ");
				query.append("                    , ? ");
				query.append("                    , ? ");
				query.append("                    , SYSDATE ");
				query.append("                    ) ");
				return query.toString();
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {
				stmt.setString(1, usersVO.getUserId());
				stmt.setString(2, usersVO.getUserPassword());
				stmt.setString(3, usersVO.getUserName());
			}

			@Override
			public Object getData(ResultSet rs) {
				return null;
			}
		});
	}

	@Override
	public UsersVO getMemberInfo(UsersVO usersVO) {
		return (UsersVO) selectOne(new QueryHandler() {

			@Override
			public String preparedQuery() {
				StringBuffer query = new StringBuffer();
				query.append(" SELECT	USR_ID ");
				query.append("          , USR_PWD ");
				query.append("          , USR_NM ");
				query.append("          , JOIN_DT ");
				query.append(" FROM     USRS ");
				query.append(" WHERE    USR_ID = ? ");
				query.append(" AND      USR_PWD = ? ");

				return query.toString();
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {
				stmt.setString(1, usersVO.getUserId());
				stmt.setString(2, usersVO.getUserPassword());
			}

			@Override
			public Object getData(ResultSet rs) {
				UsersVO usersVO = new UsersVO();
				BindData.bindData(rs, usersVO);
				return usersVO;
			}
		});
	}
}
