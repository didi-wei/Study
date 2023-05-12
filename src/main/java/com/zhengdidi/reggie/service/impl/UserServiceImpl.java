package com.zhengdidi.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhengdidi.reggie.entity.User;
import com.zhengdidi.reggie.mapper.UserMapper;
import com.zhengdidi.reggie.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{
}
