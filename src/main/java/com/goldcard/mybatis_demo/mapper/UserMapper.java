package com.goldcard.mybatis_demo.mapper;

import com.goldcard.mybatis_demo.pojo.User;
import org.springframework.stereotype.Repository;


/**** imports ****/
public interface UserMapper {
	User getUser(Long id);
}