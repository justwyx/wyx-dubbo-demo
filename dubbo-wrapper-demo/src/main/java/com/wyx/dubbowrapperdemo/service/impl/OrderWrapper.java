package com.wyx.dubbowrapperdemo.service.impl;

import com.wyx.dubbowrapperdemo.service.Order;
import org.apache.dubbo.common.URL;

/**
 * @author : Just wyx
 * @Date : 2020/11/30
 */
public class OrderWrapper implements Order {
	private Order order;

	public OrderWrapper(Order order) {
		this.order = order;
	}

	@Override
	public String way() {
		System.out.println("before-OrderWrapper-对way方法进行增强");
		String way = order.way();
		System.out.println("end-OrderWrapper-对way方法进行增强");
		return way;
	}

	@Override
	public void pay(URL str) {
		System.out.println("before-OrderWrapper-对pay方法进行增强");
		order.pay(str);
		System.out.println("end-OrderWrapper-对pay方法进行增强");
	}
}
