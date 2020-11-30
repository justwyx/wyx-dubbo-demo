package com.wyx.dubbospidemo.service2.impl;

import com.wyx.dubbospidemo.service2.GoodsOrder;
import org.apache.dubbo.common.URL;

/**
 * @author : Just wyx
 * @Date : 2020/11/30
 */
public class WeChatGoodsOrder implements GoodsOrder {
	@Override
	public String way() {
		System.out.println("微信支付方式-way()");
		return "微信支付方式";
	}

	@Override
	public void pay(URL str) {
		System.out.println("微信支付-pay()");
	}
}
