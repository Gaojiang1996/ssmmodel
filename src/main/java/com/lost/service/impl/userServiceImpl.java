package com.lost.service.impl;

import com.lost.dao.UserDao;
import com.lost.pojo.User;
import com.lost.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User getUser(long id) {
        return userDao.getUser(id);
    }
}
