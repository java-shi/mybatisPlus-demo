package com.demo.api;

import com.demo.entity.Shop;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

/**
 * @Author: Sfy
 * @DateTime: 2020/7/14 0014 11:16
 */
@Api(description = "shopController层")
public interface ShopControllerApi {
    @ApiOperation(value = "商品列表")
    public List<Shop> getShopList();

    @ApiOperation(value = "查询单个商品",tags = {"shopId"})
    public Shop getOneShop(Integer shopId);

    @ApiOperation(value = "修改商品")
    public Integer updateOneShop(Shop shop);

    @ApiOperation(value = "商品分页")
    public List queryShopPage(Shop shop);
}
