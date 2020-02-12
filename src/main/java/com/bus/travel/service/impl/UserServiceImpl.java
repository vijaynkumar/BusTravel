package com.bus.travel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bus.travel.dao.entity.User;
import com.bus.travel.dao.repository.UserRepository;
import com.bus.travel.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User addUser(User userRequest) {
		if(null != userRequest) {
			userRepository.save(userRequest);
			return userRequest;
		}
		return null;
	}

}
