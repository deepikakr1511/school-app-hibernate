package com.ty.controller;

import com.ty.school.dao.UserDao;

public class DeleteUserDriver {

	public static void main(String[] args) {
		UserDao ud=new UserDao();
		ud.deleteUser(3);
	}

}
