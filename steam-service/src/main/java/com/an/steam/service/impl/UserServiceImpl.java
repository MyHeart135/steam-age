package com.an.steam.service.impl;


import com.an.steam.dao.UserDao;
import com.an.steam.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public Integer saveUser(User user) {
        return userDao.insert(user);
    }

    @Override
    public User getUserById(Integer id) {
        return userDao.selectById(id);
    }
}
