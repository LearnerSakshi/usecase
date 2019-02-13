package com.usecasebanking.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.usecasebanking.dao.AccountDao;
import com.usecasebanking.dao.UserDao;
import com.usecasebanking.model.Account;
import com.usecasebanking.model.User;
import com.usecasebanking.service.AccountService;
import com.usecasebanking.service.UserService;

@RestController

public class LoginController {
	@Autowired
	UserService userservice;
	@Autowired
	AccountService accountservice;
	 
	@RequestMapping("/")
	public ModelAndView firstpage() {
		return new ModelAndView("index");
	}
	@RequestMapping("new")
	public ModelAndView message(@ModelAttribute("user")User user) {
		return new ModelAndView("empform");
	}
	@RequestMapping("register")
	public ModelAndView register(@ModelAttribute("user")User user) {
		return new ModelAndView("register");
	}
	@RequestMapping("registeruser")
	public ModelAndView registeruser(@ModelAttribute("user")User user) {
		userservice.save(user);
		return new ModelAndView("accountopt");
	}
	@RequestMapping("login")
	public ModelAndView SavePage(@ModelAttribute("user") User user)
	{
		User usernew=null;
		usernew=userservice.findByUsernameAndPassword(user);
		if(usernew!=null) {
			return new ModelAndView("accountopt");
		}
		else {
			return new ModelAndView("register");
		}
		
		
	}
	@RequestMapping("open")
	public ModelAndView EmpformPage(@ModelAttribute("account") Account account)
	{
		return new ModelAndView("openaccform");
		
	}
	@RequestMapping(value="/openacc",method=RequestMethod.POST)
	public ModelAndView Openaccount(@ModelAttribute("account") Account account)
	{
		System.err.println(account.getEmail());
		accountservice.save(account);
		return new ModelAndView("create");
		
	}
	@RequestMapping("update")
	public ModelAndView UpdateForm(@ModelAttribute("account") Account account,HttpServletRequest req)
	{ 
		List<Account> lp=accountservice.findAll();
		System.err.println("err");
	return new ModelAndView("AccountList","listaccount",lp);
	}
	@RequestMapping("editaccount")
	public ModelAndView EditPage(@ModelAttribute("account") Account account,HttpServletRequest req)
	{ int accid=Integer.parseInt(req.getParameter("accid"));
		System.out.println("Id"+accid);
		Optional<Account> account1=accountservice.findById(accid);
		return new ModelAndView("openaccform","accountlist",account1);
		
	}
	@RequestMapping("deleteaccount")
	public ModelAndView DeletePage(@ModelAttribute("account") Account account,HttpServletRequest req)
	{ //int id=Integer.parseInt(req.getParameter("id"));
		accountservice.delete(account);
		List<Account> lp=accountservice.findAll();
		return new ModelAndView("AccountList","listaccount",lp);
		
	}
}
