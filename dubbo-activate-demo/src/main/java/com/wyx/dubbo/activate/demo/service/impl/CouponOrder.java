package com.wyx.dubbo.activate.demo.service.impl;


import com.wyx.dubbo.activate.demo.service.Order;
import org.apache.dubbo.common.extension.Activate;

/**
 * @author : Just wyx
 * @Date : 2020/11/30
 */
@Activate(group = {"offline"}, order = 5)
public class CouponOrder implements Order {
	@Override
	public String way() {
		return "支付方式-购物卷-way()";
	}
}
