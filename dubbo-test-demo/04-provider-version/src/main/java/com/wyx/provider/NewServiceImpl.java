package com.wyx.provider;

import com.wyx.service.SomeService;

/**
 * @author : Just wyx
 * @Date : 2020/11/24
 */
public class NewServiceImpl implements SomeService {

	@Override
	public String hello(String name) {
		System.out.println("我是-NewServiceImpl-提供者:" + name);
		return "我是-NewServiceImpl-提供者:" + name;
	}

}
