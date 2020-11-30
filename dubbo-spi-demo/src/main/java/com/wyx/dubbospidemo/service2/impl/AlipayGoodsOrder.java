package com.wyx.dubbospidemo.service2.impl;

import com.wyx.dubbospidemo.service2.GoodsOrder;
import org.apache.dubbo.common.URL;

/**
 * @author : Just wyx
 * @Date : 2020/11/30
 */
public class AlipayGoodsOrder implements GoodsOrder {
	@Override
	public String way() {
		System.out.println("支付宝支付方式-way()");
		return "支付宝支付方式";
	}

	@Override
	public void pay(URL str) {
		System.out.println("支付宝支付-pay()");
	}
}
