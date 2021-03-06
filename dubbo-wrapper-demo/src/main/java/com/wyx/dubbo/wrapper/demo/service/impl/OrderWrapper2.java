package com.wyx.dubbo.wrapper.demo.service.impl;

import com.wyx.dubbo.wrapper.demo.service.Order;
import org.apache.dubbo.common.URL;

/**
 * @author : Just wyx
 * @Date : 2020/11/30
 */
public class OrderWrapper2 implements Order {
	private Order order;

	public OrderWrapper2(Order order) {
		this.order = order;
	}

	@Override
	public String way() {
		System.out.println("before-OrderWrapper2-对way方法进行增强");
		String way = order.way();
		System.out.println("end-OrderWrapper2-对way方法进行增强");
		return way;
	}

	@Override
	public String pay(URL str) {
		System.out.println("before-OrderWrapper2-对pay方法进行增强");
		String pay = order.pay(str);
		System.out.println("end-OrderWrapper2-对pay方法进行增强");
		return pay;
	}
}
