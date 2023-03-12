package com.harry.myspaces.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.harry.myspaces.dao.UserRepository;
import com.harry.myspaces.entity.User;
import com.harry.myspaces.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    /**
     * user dao.
     */
    @Autowired
    private UserRepository userDao;

    /**
     * @param user user
     */
    @Override
    public void addUser(User user) {
        userDao.save(user);
    }

    /**
     * @return user list
     */
    @Override
    public List<User> list() {
        return userDao.findAll();
    }
}
