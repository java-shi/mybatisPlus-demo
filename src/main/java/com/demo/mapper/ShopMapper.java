package com.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.entity.Shop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Sfy
 * @DateTime: 2020/7/14 0014 14:06
 */
public interface ShopMapper extends BaseMapper<Shop> {
    List<Shop> queryShopPage(@Param("shop") Shop shop);
}
