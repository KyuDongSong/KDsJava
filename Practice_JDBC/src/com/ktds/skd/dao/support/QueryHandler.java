package com.ktds.skd.dao.support;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface QueryHandler {

	// 쿼리 생성
	public String preparedQuery();

	// 파라미터 매핑
	public void mappingParameters(PreparedStatement stmt) throws SQLException;

	// 데이터 가져오기
	public Object getData(ResultSet rs);
}
