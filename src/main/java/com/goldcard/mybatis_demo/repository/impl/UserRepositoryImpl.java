package com.goldcard.mybatis_demo.repository.impl;

import com.goldcard.mybatis_demo.mapper.UserMapper;
import com.goldcard.mybatis_demo.pojo.User;
import com.goldcard.mybatis_demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser(Long id) {
        return userMapper.getUser(id);
    }
}
