package com.ktds.skd.board.board.user.dao;

import com.ktds.skd.board.board.user.vo.UsersVO;

public interface UserDao {

	public int addMemberInfo(UsersVO usersVO);
	
	public UsersVO getMemberInfo(UsersVO usersVO);

}
