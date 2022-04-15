package com.assignmentMvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignmentMvc.model.User;
import com.assignmentMvc.repository.UserRepository;
@Service
public class UserService {
	@Autowired
	UserRepository repository;
	
	public void saveUser(User user) {
		repository.save(user);
	}
	
	public boolean validateUser(String userName,String password) {
		List<User> userList = (List<User>)repository.findAll();
		for(User u:userList) {
			if(u.getUserName().equals(userName) && u.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	

}
