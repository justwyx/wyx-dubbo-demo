package com.wyx.provider;

import com.wyx.service.SomeService;

/**
 * @author : Just wyx
 * @Date : 2020/11/24
 */
public class OldServiceImpl implements SomeService {

	@Override
	public String hello(String name) {
		System.out.println("我是-OldServiceImpl-提供者:" + name);
		return "我是-OldServiceImpl-提供者:" + name;
	}

}
