package com.ktds.skd.book.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ktds.skd.book.vo.BooksVO;

public class BookDaoImpl implements BookDao {

	@Override
	public List<BooksVO> getAllBooks() {

		loacOracleDriver();

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleUrl, "BOOK", "book");

			StringBuffer query = new StringBuffer();

			query.append(" SELECT    BOOK_ID ");
			query.append("           , BOOK_NM ");
			query.append(" FROM      BOOKS ");
			query.append(" ORDER     BY BOOK_ID DESC ");

			stmt = conn.prepareStatement(query.toString());
			rs = stmt.executeQuery();

			BooksVO booksVO = null;
			List<BooksVO> booksList = new ArrayList<BooksVO>();

			while (rs.next()) {
				booksVO = new BooksVO();

				booksVO.setBookId(rs.getInt("BOOK_ID"));
				booksVO.setBookName(rs.getString("BOOK_NM"));

				booksList.add(booksVO);
			}
			return booksList;
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage(), e);
		} finally {
			close(conn, stmt, rs);
		}
	}

	@Override
	public BooksVO getOneBook(int bookId) {

		loacOracleDriver();

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleUrl, "BOOK", "book");

			StringBuffer query = new StringBuffer();

			query.append(" SELECT    BOOK_ID ");
			query.append("           , BOOK_NM ");
			query.append("           , BOOK_SUB_NM ");
			query.append("           , IDX ");
			query.append(" FROM      BOOKS ");
			query.append(" WHERE     BOOK_ID = ? ");

			stmt = conn.prepareStatement(query.toString());
			stmt.setInt(1, bookId);
			rs = stmt.executeQuery();

			BooksVO booksVO = null;
			while (rs.next()) {
				booksVO = new BooksVO();

				booksVO.setBookId(rs.getInt("BOOK_ID"));
				booksVO.setBookName(rs.getString("BOOK_NM"));
				booksVO.setBookSubName(rs.getString("BOOK_SUB_NM"));
				booksVO.setIndex(rs.getString("IDX"));
			}
			return booksVO;
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage(), e);
		} finally {
			close(conn, stmt, rs);
		}
	}

	@Override
	public int insertBook(BooksVO booksVO) {

		loacOracleDriver();

		Connection conn = null;
		PreparedStatement stmt = null;

		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleUrl, "BOOK", "book");

			StringBuffer query = new StringBuffer();

			query.append(" INSERT    INTO    BOOKS ( ");
			query.append("                          BOOK_ID   ");
			query.append("                          , BOOK_NM   ");
			query.append("                          , BOOK_SUB_NM   ");
			query.append("                          , IDX ");
			query.append("		                    ) ");
			query.append(" VALUES                   ( ");
			query.append("                          BOOKS_ID_SEQ.NEXTVAL ");
			query.append("                          , ? ");
			query.append("                          , ? ");
			query.append("                          , ? ");
			query.append("                          ) ");

			stmt = conn.prepareStatement(query.toString());

			stmt.setString(1, booksVO.getBookName());
			stmt.setString(2, booksVO.getBookSubName());
			stmt.setString(3, booksVO.getIndex());

			return stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage(), e);
		} finally {
			close(conn, stmt, null);
		}
	}

	@Override
	public int deleteBook(int bookId) {

		loacOracleDriver();

		Connection conn = null;
		PreparedStatement stmt = null;

		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleUrl, "BOOK", "book");

			StringBuffer query = new StringBuffer();

			query.append(" DELETE    FROM    BOOKS ");
			query.append(" WHERE     BOOK_ID = ? ");

			stmt = conn.prepareStatement(query.toString());
			stmt.setInt(1, bookId);

			return stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage(), e);
		} finally {
			close(conn, stmt, null);
		}
	}

	@Override
	public int modifyBook(BooksVO booksVO) {

		loacOracleDriver();

		Connection conn = null;
		PreparedStatement stmt = null;

		String oracleUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			conn = DriverManager.getConnection(oracleUrl, "BOOK", "book");

			StringBuffer query = new StringBuffer();

			query.append(" UPDATE    BOOKS ");
			query.append(" SET       BOOK_NM = ? ");
			query.append("           , BOOK_SUB_NM = ? ");
			query.append("           , IDX = ? ");
			query.append(" WHERE    BOOK_ID = ? ");

			stmt = conn.prepareStatement(query.toString());
			stmt.setString(1, booksVO.getBookName());
			stmt.setString(2, booksVO.getBookSubName());
			stmt.setString(3, booksVO.getIndex());
			stmt.setInt(4, booksVO.getBookId());

			return stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage(), e);
		} finally {
			close(conn, stmt, null);
		}
	}

	private void loacOracleDriver() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void close(Connection conn, PreparedStatement stmt, ResultSet rs) {
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
