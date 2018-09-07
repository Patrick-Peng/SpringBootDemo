package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.User;

@RestController
public class HelloWorldController {
	@RequestMapping("/hello")
    public User index() {
        User user = new User();
        user.setName("xxx");
        user.setAge(2);
        return user;
    }
}