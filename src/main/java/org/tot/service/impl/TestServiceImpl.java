package org.tot.service.impl;

import org.springframework.stereotype.Service;
import org.tot.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Override
	public void test() {
		System.out.println("spring core context is running ok!");
	}
	
}
