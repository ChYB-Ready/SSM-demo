package com.ssm.dao;

import java.util.List;

import com.ssm.entity.User;

public interface UserMapper {
    List<User> selectUserList();
}
