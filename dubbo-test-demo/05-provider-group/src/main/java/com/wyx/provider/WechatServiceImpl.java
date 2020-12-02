package com.wyx.provider;

import com.wyx.service.SomeService;

/**
 * @author : Just wyx
 * @Date : 2020/11/24
 */
public class WechatServiceImpl implements SomeService {

	@Override
	public String hello(String name) {
		System.out.println("我是-WechatServiceImpl-提供者:" + name);
		return "WechatServiceImpl";
	}

}
