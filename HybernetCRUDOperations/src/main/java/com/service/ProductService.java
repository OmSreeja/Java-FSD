package com.service;

import com.bean.Product;
import com.dao.ProductDao;
import java.util.*;
public class ProductService {
	ProductDao pd=new ProductDao();
	public String storeProduct(Product prod) {
        if(prod.getPprice()<30) {
            return "Product Price must be > 30";
        }else if(pd.storeProduct(prod)>0) {
            return "Record inserted successfully";
        }else {
            return "Record didn't insert";
        }
    }

}
