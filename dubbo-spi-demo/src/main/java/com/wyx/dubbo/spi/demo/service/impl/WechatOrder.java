package com.wyx.dubbo.spi.demo.service.impl;

import com.wyx.dubbo.spi.demo.service.Order;

/**
 * @author : Just wyx
 * @Date : 2020/11/30
 */
public class WechatOrder implements Order {
	@Override
	public String way() {
		return "支付方式-微信-way()";
	}
}
