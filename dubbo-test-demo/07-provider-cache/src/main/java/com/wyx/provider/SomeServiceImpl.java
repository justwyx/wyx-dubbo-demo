package com.wyx.provider;

import com.wyx.service.SomeService;

/**
 * @author : Just wyx
 * @Date : 2020/11/24
 */
public class SomeServiceImpl implements SomeService {

	@Override
	public String hello(String name) {
		System.out.println(name + "：我是第一个服务提供者，");
		return "我是第一个服务提供者，Hello Dubbo World! " + name;
	}

}
