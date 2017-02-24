package com.ktds.skd.dao.support;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface QueryHandler {

	// 荑쇰━瑜� �깮�꽦�빐�꽌 return
	public String preparedQuery();

	// 荑쇰━�뿉 �뙆�씪誘명꽣媛� 議댁옱�븯�뒗 寃쎌슦 �뙆�씪誘명꽣�뿉 �뜲�씠�꽣瑜� 留ㅽ븨�떆耳쒖��떎.
	public void mappingParameters(PreparedStatement stmt) throws SQLException;

	// 由ъ뒪�듃or媛앹껜 �뿉�꽌 �뜲�씠�꽣瑜� 諛쏆븘�삩�떎.
	public Object getData(ResultSet rs);

}
