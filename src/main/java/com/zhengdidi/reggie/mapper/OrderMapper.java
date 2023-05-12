package com.zhengdidi.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhengdidi.reggie.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {

}