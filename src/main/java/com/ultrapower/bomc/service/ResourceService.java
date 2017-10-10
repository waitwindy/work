package com.ultrapower.bomc.service;

import com.ultrapower.bomc.dao.ResourceMapper;
import com.ultrapower.bomc.pojo.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {

   @Autowired
    ResourceMapper resourceMapper;



   public List<Resource> getResoucrce(){
       List<Resource> list = resourceMapper.selectByExample(null);
       return list;
   };


}
