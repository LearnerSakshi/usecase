package com.usecasebanking.dao;

import org.springframework.data.repository.CrudRepository;

import com.usecasebanking.model.Account;

public interface AccountDao extends CrudRepository<Account, Integer>{

}
