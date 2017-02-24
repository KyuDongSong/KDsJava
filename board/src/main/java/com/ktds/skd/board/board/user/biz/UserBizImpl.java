package com.ktds.skd.board.board.user.biz;

import com.ktds.skd.board.board.user.dao.UserDao;
import com.ktds.skd.board.board.user.dao.UserDaoImpl;
import com.ktds.skd.board.board.user.vo.UsersVO;

public class UserBizImpl implements UserBiz{
	
	private UserDao userDao;
	public UserBizImpl(){
		userDao = new UserDaoImpl();
	}

	@Override
	public boolean addMember(UsersVO usersVO) {
		return userDao.addMemberInfo(usersVO) > 0;
	}

	@Override
	public UsersVO memberSignUp(UsersVO usersVO) {
		return userDao.getMemberInfo(usersVO);
	}
}
