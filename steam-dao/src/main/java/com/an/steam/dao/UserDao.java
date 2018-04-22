package com.an.steam.dao;



public interface UserDao {

    User selectById(Integer id);

    Integer insert(User user);

}
