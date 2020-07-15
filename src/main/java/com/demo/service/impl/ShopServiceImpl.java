package com.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.entity.Shop;
import com.demo.mapper.ShopMapper;
import com.demo.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.List;

/**
 * @Author: Sfy
 * @DateTime: 2020/7/14 0014 14:02
 */
@Service
public class ShopServiceImpl extends ServiceImpl<ShopMapper,Shop> implements ShopService {
    @Autowired(required = false)
    private ShopMapper shopMapper;
    @Override
    public List<Shop> getShopList() {
        UpdateWrapper<Shop> sw = new UpdateWrapper<>();
        sw.lambda().eq(Shop::getEntityId,1);
        List<Shop> shops = shopMapper.selectList(sw);
        return shops;
    }

    @Override
    public Shop getOneShop(Integer shopId) {
        UpdateWrapper<Shop> sw = new UpdateWrapper<>();
        sw.lambda().eq(Shop::getEntityId,1)
                    .eq(Shop::getShopId,shopId);
        Shop shop = shopMapper.selectOne(sw);
        return shop;
    }

    @Override
    public Integer updateOneShop(Shop shop) {
        UpdateWrapper<Shop> sw = new UpdateWrapper<>();
        sw.lambda().eq(Shop::getEntityId,1)
                .eq(Shop::getShopId,shop.getShopId());
        int update = shopMapper.update(shop, sw);
        return update;
    }
}
