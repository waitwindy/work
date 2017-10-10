package com.ultrapower.bomc.controller;

import com.ultrapower.bomc.pojo.Myuser;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ultrapower.bomc.service.TestService;

@Controller
public class TestController {

	private static Log log = LogFactory.getLog(TestController.class); 
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(value="TestController.html")
	public String testController(String username,String password,String code){
		log.info("测试testController");
		System.out.println(username);
		System.out.println(password);
		System.out.println(code);

		Myuser user = new Myuser();
		user.setUsername(username);
		user.setPassword(password);
		testService.insert(user);
		return "TestController";

	}
	
}
