package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.bean.*;
import com.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	@RequestMapping(value="viewProduct",method=RequestMethod.GET)
	public ModelAndView findAllProduct(HttpServletRequest req) {
		int id=Integer.parseInt(req.getParameter("id"));
		String listOfProduct=productService.getAllProduct(id);
		ModelAndView mav=new ModelAndView();
		mav.addObject("listOfProduct",listOfProduct);
		mav.setViewName("viewProduct.jsp");
		return mav;
	}

}
