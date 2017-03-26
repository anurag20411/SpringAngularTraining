package com.myApp.service.dao;

import java.sql.ResultSet;
import java.util.List;
import com.myApp.dao.*;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.myApp.usersVO.Users;
@Service ("userService")
public class UserServiceDaoImpl implements UserServiceDao{

	@Override
	public List<Users> findAllUsers() {
	System.out.println("in service");
		return UserDaoImpl.getUsers() ;
	}

}
