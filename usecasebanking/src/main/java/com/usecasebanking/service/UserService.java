package com.usecasebanking.service;

import com.usecasebanking.model.User;

public interface UserService {


	void save(User user);

	

	User findByUsernameAndPassword(User user);

}
