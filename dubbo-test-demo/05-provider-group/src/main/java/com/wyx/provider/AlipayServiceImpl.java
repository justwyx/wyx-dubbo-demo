package com.wyx.provider;

import com.wyx.service.SomeService;

/**
 * @author : Just wyx
 * @Date : 2020/11/24
 */
public class AlipayServiceImpl implements SomeService {

	@Override
	public String hello(String name) {
		System.out.println("我是-AlipayServiceImpl-提供者:" + name);
		return "AlipayServiceImpl";
	}

}
