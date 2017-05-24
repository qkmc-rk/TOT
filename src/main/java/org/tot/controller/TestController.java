package org.tot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tot.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	TestService testService;
	
	@RequestMapping("test.do")
	public String test(){
		System.out.println("spring mvc is running ok!");
		testService.test();
		return "test";
	}
	
	
	/*
	 * getter and setter
	 * 
	 * */
	public TestService getTestService() {
		return testService;
	}
	public void setTestService(TestService testService) {
		this.testService = testService;
	}
	
}
