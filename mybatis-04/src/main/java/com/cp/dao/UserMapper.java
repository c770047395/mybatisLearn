package com.cp.dao;

import com.cp.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    User getUserById(int id);
    List<User> getUserByLimit(Map<String, Object> map);
}
