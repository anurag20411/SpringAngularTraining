package com.myApp.controller;




import java.util.*;
import com.myApp.service.dao.UserServiceDao;
import com.myApp.usersVO.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyAppController {

@Autowired
UserServiceDao userService;
	@RequestMapping(path = "/getUsers.do", method = RequestMethod.GET)
	 public ResponseEntity<List<Users>> listAllUsers() {
        List<Users> users = userService.findAllUsers();
        if(users.isEmpty()){
            return new ResponseEntity<List<Users>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Users>>(users, HttpStatus.OK);
    }
	}