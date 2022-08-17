package com.main;

import com.bean.Product;
import com.service.ProductService;
import java.util.*;
public class ProductTest {

	public static void main(String[] args) {
		Product prod1 = new Product();
        prod1.setId(6);
        prod1.setPpname("sweet");
        prod1.setPprice(50);
        
        ProductService ps = new ProductService();
        String result = ps.storeProduct(prod1);
        System.out.println(result);

	}

}
