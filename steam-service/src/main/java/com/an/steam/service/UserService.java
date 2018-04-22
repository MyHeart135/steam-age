package com.an.steam.service;


import com.an.steam.bean.User;

public interface UserService {

    Integer saveUser(User user);

    User getUserById(Integer id);
}
