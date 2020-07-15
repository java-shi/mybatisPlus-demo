package com.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: Sfy
 * @DateTime: 2020/7/14 11:01
 */
@Data
@TableName("type0702")
public class ShopType {
    /**
     * 品牌唯一标识
     */
    @TableId("type_id")
    private Integer typeId;

    /**
     * 品牌名称
     */
    @TableField("type_name")
    private String typeName;
}
