package com.myApp.service.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myApp.usersVO.Users;


public interface UserServiceDao {
public List<Users> findAllUsers();
}
