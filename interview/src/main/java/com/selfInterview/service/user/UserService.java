package com.selfInterview.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selfInterview.dao.user.UserDAO;
import com.selfInterview.dto.User;

@Service
public class UserService implements UserMapper{
	@Autowired
	UserDAO userDAO;
	@Override
	public String idCheck(String id) {
		return userDAO.idCheck(id);
	}

}
