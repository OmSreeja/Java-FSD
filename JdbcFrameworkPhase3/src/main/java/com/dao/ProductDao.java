package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.bean.Product;

@Repository
public class ProductDao {
	@Autowired
	Product product;
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	DataSource ds;
	public Product getAllProduct(int id) {
		Connection con=ds.getConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from product where id = "+id);
	    //pstmt.setInt(1, product.getId());
	   	ResultSet rs = pstmt.executeQuery();
	   	if(rs.next()) {
		return product;
		
		/*try {
			Connection con=ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from product where id = "+id);
		    //pstmt.setInt(1, product.getId());
		   	ResultSet rs = pstmt.executeQuery();
		   	if(rs.next()) {
			return product;
		   	}
			} catch (Exception e) {
			System.out.println(e);
			return ;
			}
		    return "f";	
			}*/
	

}
