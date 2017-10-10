package com.ultrapower.bomc.controller;


import com.ultrapower.bomc.pojo.Msg;
import com.ultrapower.bomc.pojo.Redis;
import com.ultrapower.bomc.service.RedisService;
import com.ultrapower.bomc.service.impl.RedisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class RedisController {

    @Autowired
    RedisService redisService;
    @Autowired
    RedisServiceImpl redisServiceImpl;

    @RequestMapping(value = {"/redis1"})
    public String queryRedis(HttpSession httpSession, Model model, @RequestParam(required = false)String redisName){
      List<Redis> list = redisServiceImpl.queryByReidsName(redisName);
        return "list";
    };

    @RequestMapping(value = {"/redis"})
    @ResponseBody
    public Msg getRedis(){
        List<Redis> list = redisService.getRedis();
        return Msg.success().add("redis",list);
    }

//    @RequestMapping("/redis")
    public String getRedis2(HttpSession session,Model model){
        List<Redis> redis = redisServiceImpl.getRedis();
        Msg redislist = Msg.success().add("redislist", redis);
        model.addAttribute("redis",redislist);
        return "list";
    }

}
