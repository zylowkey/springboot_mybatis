package com.goldcard.mybatis_demo.repository;

import com.goldcard.mybatis_demo.pojo.User;

public interface UserRepository {
    User getUser(Long id);
}
