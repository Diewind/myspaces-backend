package com.harry.myspaces.service;

import java.util.List;

import com.harry.myspaces.entity.User;

public interface UserService {
    /**
     * @param user user
     */
    void addUser(User user);

    /**
     * @return user list
     */
    List<User> list();
}
