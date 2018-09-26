package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UserMapper;
import com.ssm.entity.User;
import com.ssm.service.UserService;

/**
 * @author MyLitter
 * @Service 注册service
 * 
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userDao;
    
    public List<User> queryUserList() {
        List<User> list = userDao.selectUserList();
        return list;
    }

}
