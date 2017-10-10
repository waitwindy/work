package com.ultrapower.bomc.service.impl;

import com.ultrapower.bomc.dao.RedisMapper;
import com.ultrapower.bomc.pojo.Redis;
import com.ultrapower.bomc.pojo.RedisExample;
import com.ultrapower.bomc.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RedisServiceImpl implements RedisService{

    @Autowired
    RedisMapper redisMapper;

    @Override
    public List<Redis> getRedis() {

        List<Redis> list = redisMapper.selectByExample(null);
        return list;
    }

    public List<Redis> queryByReidsName(String redisName) {
        RedisExample redisExample = new RedisExample();
        RedisExample.Criteria criteria = redisExample.createCriteria();
        criteria.andRedisNameEqualTo(redisName);
        List<Redis> list = redisMapper.selectByExample(redisExample);
        return list;
    }
}
