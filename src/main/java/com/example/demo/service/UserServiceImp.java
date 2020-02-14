package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
@Service
public class UserServiceImp implements UserService {
	@Autowired
    UserDao userDao;


    public List<User> getUser() {
        // TODO Auto-generated method stub
        return userDao.getUser();
    }
    
    public void createUser(User user) {
    	userDao.addUser(user);
    }
}