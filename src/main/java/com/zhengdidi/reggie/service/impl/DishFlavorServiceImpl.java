package com.zhengdidi.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhengdidi.reggie.entity.DishFlavor;
import com.zhengdidi.reggie.mapper.DishFlavorMapper;
import com.zhengdidi.reggie.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper,DishFlavor> implements DishFlavorService {
}
