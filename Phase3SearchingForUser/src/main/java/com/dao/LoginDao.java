package com.dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.bean.Login;
@Repository
public class LoginDao {
	@Autowired
	Login login;
	@Autowired
	JdbcTemplate jdbcTemplate;
     public int signIn(Login login) {
    	 try {
    	 List l1=jdbcTemplate.queryForList("select * from login where email=? and password=?",login.getEmail(),login.getPassword());
    	 return l1.size();
    	 }
    	 catch(Exception e) {
    		 System.out.println(e);
    		 return 0;
    	 }
     }
     public int signUp(Login login) {
    	 try {
    		 return jdbcTemplate.update("insert into login value(?,?)",login.getEmail(),login.getPassword());
    	 }
    	 catch(Exception e) {
    		 System.out.println(e);
    		 return 0;
    	 }
     }
}
