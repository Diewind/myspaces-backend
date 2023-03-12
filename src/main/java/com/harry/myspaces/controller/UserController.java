package com.harry.myspaces.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.harry.myspaces.entity.User;
import com.harry.myspaces.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("add")
    public User add(User user){
        userService.addUser(user);
        return user;
    }

    @GetMapping("list")
    public List<User> list(){
        return userService.list();
    }
}
