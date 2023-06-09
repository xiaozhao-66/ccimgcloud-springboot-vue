/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.xz.admin.modules.sys.redis;

import com.xz.admin.common.redis.RedisKeys;
import com.xz.admin.common.redis.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 参数管理
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0
 */
@Component
public class SysParamsRedis {

    @Autowired
    private RedisUtils redisUtils;

    public void delete(Object[] paramCodes) {
        String key = RedisKeys.getSysParamsKey();
        redisUtils.hDel(key, paramCodes);
    }

    public void set(String paramCode, String paramValue){
        if(paramValue == null){
            return ;
        }
        String key = RedisKeys.getSysParamsKey();
        redisUtils.hSet(key, paramCode, paramValue);
    }

    public String get(String paramCode){
        String key = RedisKeys.getSysParamsKey();
        return (String)redisUtils.hGet(key, paramCode);
    }

}
