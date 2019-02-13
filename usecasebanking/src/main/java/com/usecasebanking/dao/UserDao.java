package com.usecasebanking.dao;

import org.springframework.data.repository.CrudRepository;

import com.usecasebanking.model.Account;
import com.usecasebanking.model.User;

public interface UserDao extends CrudRepository<User, Integer>{

	public User findByUsernameAndPassword(String username, String password);
	public Account findById(Account account);

}
