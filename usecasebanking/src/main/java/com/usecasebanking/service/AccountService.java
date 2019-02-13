package com.usecasebanking.service;

import java.util.List;
import java.util.Optional;

import com.usecasebanking.model.Account;
import com.usecasebanking.model.User;

public interface AccountService {
	void save(Account account);

	List<Account> findAll();

	Optional<Account> findById(int accid);

	void delete(Account account);
	

}
