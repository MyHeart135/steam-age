package com.an.steam.dao;


import com.an.steam.bean.User;

public interface UserDao {

    User selectById(Integer id);

    Integer insert(User user);

}
