package com.wyx.dubbowrapperdemo.service.impl;

import com.wyx.dubbowrapperdemo.service.Order;
import org.apache.dubbo.common.URL;

/**
 * @author : Just wyx
 * @Date : 2020/11/30
 */
public class WeChatOrder implements Order {
	@Override
	public String way() {
		return "微信支付方式";
	}

	@Override
	public void pay(URL str) {
		System.out.println("微信支付-pay()");
	}
}
