package com.wyx.provider;

import com.wyx.service.SomeService;

/**
 * @author : Just wyx
 * @Date : 2020/11/24
 */
public class SomeServiceImpl implements SomeService {

	@Override
	public String hello(String name) {
		System.out.println(name + "，我是提供者");
		return "Hello Dubbo World! " + name;
	}

}
