package com.goldcard.mybatisdemo.controller;

import com.goldcard.mybatisdemo.pojo.User;
import com.goldcard.mybatisdemo.service.MybatisUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**** imports ****/
@Controller
@RequestMapping("/mybatis")
public class MyBatisController {
	
	@Autowired
	private MybatisUserService myBatisUserService;
	
	@RequestMapping("/getUser")
	@ResponseBody
	public User getUser(Long id) {
		return myBatisUserService.getUser(id);
	}
}ËÆ