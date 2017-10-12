package com.ultrapower.bomc.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ultrapower.bomc.pojo.Msg;
import com.ultrapower.bomc.pojo.Redis;
import com.ultrapower.bomc.service.RedisService;
import com.ultrapower.bomc.service.impl.RedisServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class RedisController {

    @Autowired
    RedisService redisService;
    @Autowired
    RedisServiceImpl redisServiceImpl;

    @RequestMapping(value = {"/redis1"})
    @ResponseBody
    public String queryRedis(HttpSession httpSession, Model model, @RequestParam(required = false)String redisName){

      List<Redis> list = redisServiceImpl.queryByReidsName(redisName);
        return "list";
    };

//    @RequestMapping(value = {"/redis"})
    @ResponseBody
    public ModelAndView getRedis(Model model){
        List<Redis> list = redisService.getRedis();

        model.addAttribute("redis",list);
        return new  ModelAndView("/list","status",list);
    }

    @RequestMapping(value = "/getJson")
    @ResponseBody
    public Msg getRedisWithJson(@RequestParam(value = "pn",defaultValue = "1")Integer pn,Model model) {

        PageHelper.startPage(pn, 5);
        // startPage后面紧跟的这个查询就是一个分页查询
        List<Redis> redis = redisServiceImpl.getRedis();

        PageInfo page = new PageInfo(redis, 5);
        return Msg.success().add("pageInfo", page);
//        return Msg;
    }

    @RequestMapping("/forEx")
//    @ResponseBody
    public ModelAndView getEx2(Model model){
        List<Redis> redis = redisServiceImpl.getRedis();
        return new ModelAndView("list","redis",redis);
    }

//    @RequestMapping("/forEx")
    @ResponseBody
    public String getEx(){
//        Redis redis = new Redis();
//        redis.setRedisid(1);
//        redis.setRedisName("nwe");
//        redis.setSysCpuRate(0.3F);
//        redis.setUsrCpuRate(0.121F);
        return "redis";
    }

//    @RequestMapping("/redis")
    public String getRedis2(HttpSession session,Model model){
        List<Redis> redis = redisServiceImpl.getRedis();
        Msg redislist = Msg.success().add("redislist", redis);
        model.addAttribute("redis",redislist);
        return "list";
    }


}
