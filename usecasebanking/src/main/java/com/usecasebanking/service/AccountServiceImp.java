package com.usecasebanking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usecasebanking.dao.AccountDao;
import com.usecasebanking.dao.UserDao;
import com.usecasebanking.model.Account;
import com.usecasebanking.model.User;

@Service
public class AccountServiceImp implements AccountService{
	@Autowired
	  private AccountDao accountdao;
	  public void save(Account account) {
		   accountdao.save(account);
	  }
	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return (List<Account>) accountdao.findAll();
	}
	@Override
	public Optional<Account> findById(int accid) {
		 return  accountdao.findById(accid);
	}
	
	public void delete(Account account) {
		accountdao.delete(account);
		
	}
}
