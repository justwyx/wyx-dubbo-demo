package com.wyx.dubbo.activate.demo.service.impl;


import com.wyx.dubbo.activate.demo.service.Order;
import org.apache.dubbo.common.extension.Activate;

/**
 * @author : Just wyx
 * @Date : 2020/11/30
 */
@Activate(group = {"online", "offline"}, order = 3)
public class CardOrder implements Order {
	@Override
	public String way() {
		return "支付方式-银行卡-way()";
	}
}
