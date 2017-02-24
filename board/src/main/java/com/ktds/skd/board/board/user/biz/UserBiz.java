package com.ktds.skd.board.board.user.biz;

import com.ktds.skd.board.board.user.vo.UsersVO;

public interface UserBiz {

	public boolean addMember(UsersVO usersVO);
	
	public UsersVO memberSignUp(UsersVO usersVO);
	
}
