package com.ktds.skd.book.users.biz;

import com.ktds.skd.book.users.dao.UserDao;
import com.ktds.skd.book.users.dao.UserDaoImpl;
import com.ktds.skd.book.users.vo.UsersVO;

public class UserBizImpl implements UserBiz {

	private UserDao userDao;

	public UserBizImpl() {
		userDao = new UserDaoImpl();
	}

	@Override
	public boolean addUser(UsersVO usersVO) {
		return userDao.addOneUserInfo(usersVO) > 0;
	}

	@Override
	public UsersVO signUp(UsersVO usersVO) {
		return userDao.getOneUserInfo(usersVO);
	}

}
