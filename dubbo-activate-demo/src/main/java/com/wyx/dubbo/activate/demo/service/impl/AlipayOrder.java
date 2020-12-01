package com.wyx.dubbo.activate.demo.service.impl;


import com.wyx.dubbo.activate.demo.service.Order;
import org.apache.dubbo.common.extension.Activate;

/**
 * @author : Just wyx
 * @Date : 2020/11/30
 */
@Activate(group = "online", value = "alipay")
public class AlipayOrder implements Order {
	@Override
	public String way() {
		return "支付方式-支付宝-way()";
	}
}
