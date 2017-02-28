package com.ktds.skd.book.users.biz;

import com.ktds.skd.book.users.vo.UsersVO;

public interface UserBiz {

	public boolean addUser(UsersVO usersVO);
	
	public UsersVO signUp(UsersVO usersVO);
}
