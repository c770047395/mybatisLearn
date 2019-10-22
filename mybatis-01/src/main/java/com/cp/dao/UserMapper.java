package com.cp.dao;

import com.cp.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> getUserLike(String value);
    List<User> getUserList();
    User getUserById(int id);
    int addUser(User user);

    int addUser2(Map<String,Object> map);

    int updateUser(User user);
    int deleteUser(int id);
}
