package com.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

/**
 * @Author: Sfy
 * @DateTime: 2020/7/14 0014 11:05
 */
@Data
@TableName("shop0702")
public class Shop {
    /**
     * 唯一标识
     */
    @TableId("shop_id")
    private Integer shopId;
    /**
     * 商品名称
     */
    @TableField("shop_name")
    private String shopName;
    /**
     * 创建时间
     */
    @TableField("shop_time")
    private String shopTime;
    /**
     * 图片地址
     */
    @TableField("pic_url")
    private String picUrl;
    /**
     * 是否可用
     */
    @TableField("entity_id")
    private Integer entityId;
    /**
     * 商品类型
     */
    @TableField("type_id")
    private Integer typeId;

}
