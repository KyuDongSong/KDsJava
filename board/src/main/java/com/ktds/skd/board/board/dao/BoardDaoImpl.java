package com.ktds.skd.board.board.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ktds.skd.board.board.vo.BoardVO;
import com.ktds.skd.dao.support.JDBCDaoSupport;
import com.ktds.skd.dao.support.QueryHandler;
import com.ktds.skd.dao.support.annotation.BindData;

/**
 * Created by Admin on 2017-02-17.
 */
public class BoardDaoImpl extends JDBCDaoSupport implements BoardDao {

	@Override
	public int insertArticle(BoardVO boardVO) {

		return update(new QueryHandler() {

			@Override
			public String preparedQuery() {
				StringBuffer query = new StringBuffer();
				query.append(" INSERT    INTO    BOARD ( ");
				query.append("                          BOARD_ID ");
				query.append("                          , SUBJECT ");
				query.append("                          , CONTENT ");
				query.append("                          , WRITER ");
				query.append("                          , LIKE_COUNT ");
				query.append("                          , WRITE_DATE ");
				query.append("                         ) ");
				query.append(" VALUES                  ( ");
				query.append("                              BOARD_ID_SEQ.NEXTVAL ");
				query.append("                              , ? ");
				query.append("                              , ? ");
				query.append("                              , ? ");
				query.append("                              , 0 ");
				query.append("                              , SYSDATE ");
				query.append("                          ) ");

				return query.toString();
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {
				stmt.setString(1, boardVO.getSubject());
				stmt.setString(2, boardVO.getContent());
				stmt.setString(3, boardVO.getWriter());
			}

			@Override
			public Object getData(ResultSet rs) {
				return null;
			}
		});
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BoardVO> selectAllArticles() {
		return selectList(new QueryHandler() {
			@Override
			public String preparedQuery() {
				StringBuffer query = new StringBuffer();
				query.append(" SELECT    BOARD_ID ");
				query.append("          , SUBJECT ");
				query.append("          , CONTENT ");
				query.append("          , WRITER ");
				query.append("          , LIKE_COUNT ");
				query.append("          , WRITE_DATE ");
				query.append(" FROM      BOARD ");
				query.append(" ORDER	BY BOARD_ID DESC");
				return query.toString();
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {

			}

			@Override
			public Object getData(ResultSet rs) {

				BoardVO boardVO = new BoardVO();
				BindData.bindData(rs, boardVO);
				return boardVO;
			}
		});
	}

	@Override
	public BoardVO selectOneArticle(int boardId) {
		return (BoardVO) selectOne(new QueryHandler() {
			@Override
			public String preparedQuery() {
				StringBuffer query = new StringBuffer();
				query.append(" SELECT   BOARD_ID");
				query.append("          , SUBJECT ");
				query.append("          , CONTENT ");
				query.append("          , WRITER ");
				query.append("          , LIKE_COUNT ");
				query.append("          , WRITE_DATE ");
				query.append(" FROM     BOARD ");
				query.append(" WHERE    BOARD_ID = ? ");

				return query.toString();
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {
				stmt.setInt(1, boardId);
			}

			@Override
			public Object getData(ResultSet rs) {
				BoardVO boardVO = new BoardVO();
				BindData.bindData(rs, boardVO);
				return boardVO;
			}
		});
	}

	@Override
	public int deleteArticle(int boardId) {
		return update(new QueryHandler() {
			@Override
			public String preparedQuery() {
				StringBuffer query = new StringBuffer();

				query.append(" DELETE         ");
				query.append(" FROM     BOARD ");
				query.append(" WHERE    BOARD_ID = ? ");

				return query.toString();
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {
				stmt.setInt(1, boardId);
			}

			@Override
			public Object getData(ResultSet rs) {
				return null;
			}
		});
	}

	@Override
	public int updateArticle(BoardVO boardVO) {
		return update(new QueryHandler() {

			@Override
			public String preparedQuery() {
				StringBuffer query = new StringBuffer();
				query.append(" UPDATE    BOARD");
				query.append(" SET       WRITER = ? ");
				query.append("           , SUBJECT = ? ");
				query.append("           , CONTENT = ? ");
				query.append(" WHERE    BOARD_ID = ? ");

				return query.toString();
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {
				stmt.setString(1, boardVO.getWriter());
				stmt.setString(2, boardVO.getSubject());
				stmt.setString(3, boardVO.getContent());
				stmt.setInt(4, boardVO.getBoardId());

			}

			@Override
			public Object getData(ResultSet rs) {
				return null;
			}

		});
	}
}
