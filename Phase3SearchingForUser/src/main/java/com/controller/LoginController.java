package com.controller;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.bean.Login;
import com.service.LoginService;
@Controller
public class LoginController {
	@Autowired
	LoginService loginService;
	@RequestMapping(value="signIn",method=RequestMethod.POST)
	public ModelAndView signIn(HttpServletRequest req,Login login) {
		ModelAndView mav=new ModelAndView();
		String email=req.getParameter("email");
		mav.addObject("obj1",email);
		String password=req.getParameter("password");
		mav.addObject("obj2",password);
		login.setEmail(email);
		login.setPassword(password);
		String result=loginService.signIn(login);
		if(result.equals("success")) {
			mav.setViewName("success.jsp");
		}
		else {
			mav.setViewName("failure.jsp");
		}
		return mav;
	}
	@RequestMapping(value="signUp",method=RequestMethod.POST)
	public ModelAndView signUp(HttpServletRequest req,Login login) {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		login.setEmail(email);
		login.setPassword(password);
		ModelAndView mav=new ModelAndView();
		String result=loginService.signUp(login);
		mav.addObject("obj",result);
		mav.setViewName("login.jsp");
		return mav;
	}
}
