package com.ultrapower.bomc.dao;

import com.ultrapower.bomc.pojo.Redis;
import com.ultrapower.bomc.pojo.RedisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RedisMapper {
    long countByExample(RedisExample example);

    int deleteByExample(RedisExample example);

    int deleteByPrimaryKey(Integer redisid);

    int insert(Redis record);

    int insertSelective(Redis record);

    List<Redis> selectByExample(RedisExample example);

    Redis selectByPrimaryKey(Integer redisid);

    int updateByExampleSelective(@Param("record") Redis record, @Param("example") RedisExample example);

    int updateByExample(@Param("record") Redis record, @Param("example") RedisExample example);

    int updateByPrimaryKeySelective(Redis record);

    int updateByPrimaryKey(Redis record);
}