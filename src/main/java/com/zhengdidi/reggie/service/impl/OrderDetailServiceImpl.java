package com.zhengdidi.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhengdidi.reggie.entity.OrderDetail;
import com.zhengdidi.reggie.mapper.OrderDetailMapper;
import com.zhengdidi.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}