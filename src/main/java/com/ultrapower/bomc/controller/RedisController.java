package com.ultrapower.bomc.controller;


import com.ultrapower.bomc.pojo.Msg;
import com.ultrapower.bomc.pojo.Redis;
import com.ultrapower.bomc.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RedisController {

    @Autowired
    RedisService redisService;

    @RequestMapping("/redis")
    @ResponseBody
    public Msg getRedis(){
        List<Redis> list = redisService.getRedis();
        return Msg.success().add("redis",list);
    }


}
