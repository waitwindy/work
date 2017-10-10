package com.ultrapower.bomc.test;

import com.ultrapower.bomc.dao.MyuserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/application-context.xml","classpath:springmvc-controller.xml"})
@Transactional
public class TestDataSource {

    @Autowired
    MyuserMapper myuserMapper;

    @Autowired
    SqlSession sqlSession;

    @Test
    public  void getMapper (){
        System.out.println(myuserMapper);
    }

}
