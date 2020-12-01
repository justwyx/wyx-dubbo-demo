package com.wyx.dubbo.adaptiveclass.demo.service.impl;

import com.wyx.dubbo.adaptiveclass.demo.service.Order;

/**
 * @author : Just wyx
 * @Date : 2020/11/30
 */
public class AlipayOrder implements Order {
	@Override
	public String way() {
		return "支付方式-支付宝-way()";
	}

}
