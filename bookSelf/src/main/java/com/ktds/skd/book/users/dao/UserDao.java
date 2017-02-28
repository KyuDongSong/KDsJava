package com.ktds.skd.book.users.dao;

import com.ktds.skd.book.users.vo.UsersVO;

public interface UserDao {

	public UsersVO getOneUserInfo(UsersVO usersVO);
	
	public int addOneUserInfo(UsersVO usersVO); 
	
}
