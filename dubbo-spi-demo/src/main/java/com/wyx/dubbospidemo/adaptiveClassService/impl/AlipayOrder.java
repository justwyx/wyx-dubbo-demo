package com.wyx.dubbospidemo.adaptiveClassService.impl;

import com.wyx.dubbospidemo.adaptiveClassService.Order;

/**
 * @author : Just wyx
 * @Date : 2020/11/30
 */
public class AlipayOrder implements Order {
	@Override
	public String way() {
		return "支付宝支付方式";
	}
}