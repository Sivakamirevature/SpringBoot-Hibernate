package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.User;

public interface UserDao {

	List<User> getUser();

	void addUser(User user);

}
