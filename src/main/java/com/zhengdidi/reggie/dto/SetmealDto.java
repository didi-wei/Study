package com.zhengdidi.reggie.dto;

import com.zhengdidi.reggie.entity.Setmeal;
import com.zhengdidi.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
