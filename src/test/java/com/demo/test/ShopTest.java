package com.demo.test;

import com.demo.entity.Shop;
import com.demo.service.ShopService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: Sfy
 * @DateTime: 2020/7/21 0021 15:30
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ShopTest {

    @Autowired
    ShopService shopService;

    @Test
    public void testAddShop(){
        Shop shop = new Shop();
        shop.setEntityId(1);
        shop.setPicUrl("16a1c30b08131015.jpg");
        shop.setShopName("苹果");
        shop.setTypeId(1);
        shop.setShopTime("2020-07-07 00:00:00");
        int y = 0;
        for(int i = 100000; i < 500000 ; i++){
            shop.setShopId(i);
            int i1 = shopService.addShop(shop);
            y+=i1;
        }
        System.out.println(y);
    }


}
