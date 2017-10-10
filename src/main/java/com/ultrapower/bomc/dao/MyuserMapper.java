package com.ultrapower.bomc.dao;

import com.ultrapower.bomc.pojo.Myuser;
import com.ultrapower.bomc.pojo.MyuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyuserMapper {
    int countByExample(MyuserExample example);

    int deleteByExample(MyuserExample example);

    int insert(Myuser record);

    int insertSelective(Myuser record);

    List<Myuser> selectByExample(MyuserExample example);

    int updateByExampleSelective(@Param("record") Myuser record, @Param("example") MyuserExample example);

    int updateByExample(@Param("record") Myuser record, @Param("example") MyuserExample example);
}