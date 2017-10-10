package com.ultrapower.bomc.service.impl;

import com.ultrapower.bomc.dao.MyuserMapper;
import com.ultrapower.bomc.pojo.Myuser;
import com.ultrapower.bomc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TestServiceImpl implements TestService{


	@Autowired
	private MyuserMapper myuserMapper;
	
	public void insert(Myuser user) {
		myuserMapper.insertSelective(user);
	}
	
}
