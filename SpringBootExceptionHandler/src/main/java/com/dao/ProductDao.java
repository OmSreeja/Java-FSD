package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Product;
@Repository
public class ProductDao {

	public String exceptionHandling() {
		return "Product Not Found 404 error";
	}

}
