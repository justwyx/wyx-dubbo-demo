package com.wyx.dubbo.adaptive.method.demo.service.impl;

import com.wyx.dubbo.adaptive.method.demo.service.Order;
import org.apache.dubbo.common.URL;

/**
 * @author : Just wyx
 * @Date : 2020/11/30
 */
public class WechatOrder implements Order {
	@Override
	public String way() {
		return "支付方式-微信-way()";
	}

	@Override
	public String pay(URL url) {
		return "支付-微信-pay()";
	}
}
