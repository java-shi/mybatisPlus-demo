package com.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.entity.Shop;

import java.util.List;

/**
 * @Author: Sfy
 * @DateTime: 2020/7/14 0014 14:02
 */
public interface ShopService extends IService<Shop> {
    List<Shop> getShopList();

    Shop getOneShop(Integer shopId);

    Integer updateOneShop(Shop shop);

    List queryShopPage(Shop shop);

    int addShop(Shop shop);
}
