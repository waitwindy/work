package com.ultrapower.bomc.controller;

import com.ultrapower.bomc.pojo.Msg;
import com.ultrapower.bomc.pojo.Resource;
import com.ultrapower.bomc.service.ResourceService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class ResourceController {

    @Autowired
    ResourceService resourceService;



    @RequestMapping(value="/resource/{pn}",method= RequestMethod.DELETE)
    public Msg getResouce(@Param("pn") String pn){
        List<Resource> list=resourceService.getResoucrce();
        return Msg.success().add("res",list);
    }

}
