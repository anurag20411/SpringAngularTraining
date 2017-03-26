package com.myApp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.myApp.usersVO.Users;

public class UserDaoImpl  {
	private static DataSource dataSource;
	private static JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;

	}
	
	public static List<Users> getUsers(){
    jdbcTemplate = new JdbcTemplate(dataSource);
	String sql = "SELECT * FROM users";
	List<Users> users = new ArrayList<Users>();
    List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
	
    for (Map row : rows) {
	Users u = new Users();
	u.setId(String.valueOf(row.get("ID")));
    u.setName((String) row.get("NAME"));
    u.setAddress(String.valueOf(row.get("ADDRESS")));
    u.setEmail(String.valueOf(row.get("email")));
    users.add(u);
		}
    System.out.println(users.size());
		return users;
   }
}
