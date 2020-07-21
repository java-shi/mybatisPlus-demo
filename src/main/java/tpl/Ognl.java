package tpl;

import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;

/**
 * @Author: Sfy
 * @DateTime: 2020/7/21 0021 14:59
 */
public class Ognl {
    public static boolean isNotEmpty(Object obj){
        return ObjectUtils.isNotEmpty(obj);
    }
}
