package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Product;
import com.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	@RequestMapping(value="findProductById/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	   public String findProductById(@PathVariable("id") int id) {
		   
		if (id==0)
            return productService.exceptionHandling();
        return "Product was found";

	   }
}
