package com.usecasebanking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.usecasebanking.dao.AccountDao;
import com.usecasebanking.dao.UserDao;
import com.usecasebanking.model.User;
@Service
public class UserServiceImpl implements UserService{

  @Autowired
  private UserDao userdao;
  public void save(User user) {
	   userdao.save(user);
  }
@Override
public User findByUsernameAndPassword(User user) {
	return userdao.findByUsernameAndPassword(user.getUsername(),user.getPassword());
}
 
}