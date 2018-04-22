package com.an.steam.service.impl;


import com.an.steam.bean.User;
import com.an.steam.dao.UserDao;
import com.an.steam.manager.UserManager;
import com.an.steam.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Resource
    private UserManager userManager;


    @Override
    public Integer saveUser(User user) {
        return userManager.inserUser(user);
    }

    @Override
    public User getUserById(Integer id) {
        return userDao.selectById(id);
    }
}
