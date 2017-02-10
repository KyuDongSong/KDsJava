package com.ktds.skd.hr.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ktds.skd.dao.support.JDBCDaoSupport;
import com.ktds.skd.dao.support.QueryHandler;
import com.ktds.skd.dao.support.annotation.BindData;
import com.ktds.skd.hr.vo.BookStoreVO;

public class BookStoreDaoImpl extends JDBCDaoSupport implements BookStoreDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<BookStoreVO> getAllBookList() {
		return selectList(new QueryHandler() {

			@Override
			public String preparedQuery() {
				String query = "SELECT BS.BOOKSTORE_ID " + "        , B.BOOK_ID " + "        , BS.CATEGORY "
						+ "        , BS.STOCK " + "FROM    BOOKSTORE BS " + "        , BOOK B "
						+ "WHERE   BS.BOOK_ID = B.BOOK_ID ";

				return query;
			}

			@Override
			public void mappingParameters(PreparedStatement stmt) throws SQLException {
			}

			@Override
			public Object getData(ResultSet rs) {
				BookStoreVO bookStoreVO = new BookStoreVO();
				BindData.bindData(rs, bookStoreVO);
				BindData.bindData(rs, bookStoreVO.getBooks());

				return bookStoreVO;
			}

		});
	}

}
