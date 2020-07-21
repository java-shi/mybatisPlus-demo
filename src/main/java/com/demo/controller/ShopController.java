package com.demo.controller;

import com.demo.api.ShopControllerApi;
import com.demo.entity.Shop;
import com.demo.service.ShopService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Sfy
 * @DateTime: 2020/7/14 0014 11:29
 */
@RestController
public class ShopController implements ShopControllerApi {


    @Autowired(required = false)
    private ShopService shopService;

    @Override
    @RequestMapping(method = RequestMethod.GET,path = "/getShopList")
    public List<Shop> getShopList() {
        return shopService.getShopList();
    }

    @Override
    @RequestMapping(method = RequestMethod.GET,path = "/getOneShop/{shopId}")
    public Shop getOneShop(@PathVariable("shopId") Integer shopId) {
        return shopService.getOneShop(shopId);
    }

    @Override
    @RequestMapping(method = RequestMethod.POST,path = "/updateOneShop")
    public Integer updateOneShop(@RequestBody Shop shop) {
        return shopService.updateOneShop(shop);
    }

    @Override
    @RequestMapping(method = RequestMethod.POST,path = "/queryShopPage")
    public List queryShopPage(@RequestBody Shop shop) {
        return shopService.queryShopPage(shop);
    }
}
