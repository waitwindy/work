package com.ultrapower.bomc.service;

import com.ultrapower.bomc.pojo.Redis;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RedisService {
    public List<Redis> getRedis ();
 }
