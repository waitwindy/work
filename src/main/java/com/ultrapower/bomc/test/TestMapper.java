package com.ultrapower.bomc.test;

import com.ultrapower.bomc.dao.RedisMapper;
import com.ultrapower.bomc.dao.ResourceMapper;
import com.ultrapower.bomc.pojo.Redis;
import com.ultrapower.bomc.pojo.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context.xml")
public class TestMapper {

    @Autowired
    private ResourceMapper resourceMapper;
    @Autowired
    private RedisMapper redisMapper;

    @Test
    public  void testShowResource() {
        List<Resource> list = resourceMapper.selectByExample(null);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    @Test
    public void testRedisMapper(){

        List<Redis> list = redisMapper.selectByExample(null);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));


        }

    }

}
