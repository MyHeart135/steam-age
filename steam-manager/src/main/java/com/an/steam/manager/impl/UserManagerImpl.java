package com.an.steam.manager.impl;

import com.an.steam.bean.User;
import com.an.steam.dao.UserDao;
import com.an.steam.manager.UserManager;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created with IDEA
 * Author: caian
 * Modify:caian
 * Description
 * Date:2018/4/22
 * Time:11:27
 */
@Component
public class UserManagerImpl implements UserManager {
    @Resource
    private UserDao userDao;


    @Override
    public Integer inserUser(User user) {
        return userDao.insert(user);
    }
}
