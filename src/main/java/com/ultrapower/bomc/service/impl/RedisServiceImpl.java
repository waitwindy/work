package com.ultrapower.bomc.service.impl;

import com.ultrapower.bomc.dao.RedisMapper;
import com.ultrapower.bomc.pojo.Redis;
import com.ultrapower.bomc.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RedisServiceImpl implements RedisService{

    @Autowired
    RedisMapper redisMapper;

    @Override
    public List<Redis> getRedis() {

        List<Redis> list = redisMapper.selectByExample(null);
        return list;
    }
}
