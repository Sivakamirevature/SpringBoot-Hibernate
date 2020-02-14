package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("users")
public class Controller {
	 @Autowired
	 UserService userService;
	 
	 @GetMapping(value="/get", headers="Accept=application/json")
	    public List<User> getAllUser() {
	        List<User> tasks=userService.getUser();
	        return tasks;
	    }	
	 
	 @PostMapping(value="/create",headers="Accept=application/json")
	 void createUser(@RequestBody User user){
	        System.out.println("Creating User "+user.getName());
	        userService.createUser(user);
			
	    }
}
