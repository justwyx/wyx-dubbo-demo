package com.wyx.dubbo.wrapper.demo.service;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : Just wyx
 * @Date : 2020/11/30
 */
@SpringBootTest
public class WrapperTest {

	/**
	 * wrapper 类对扩展类方法进去增强
	 *
	 * before-OrderWrapper2-对way方法进行增强
	 * before-OrderWrapper-对way方法进行增强
	 * end-OrderWrapper-对way方法进行增强
	 * end-OrderWrapper2-对way方法进行增强
	 * 支付方式-支付宝-way()
	 * before-OrderWrapper2-对way方法进行增强
	 * before-OrderWrapper-对way方法进行增强
	 * end-OrderWrapper-对way方法进行增强
	 * end-OrderWrapper2-对way方法进行增强
	 * 支付方式-微信-way()
	 */
	@Test
	public void test() {
		ExtensionLoader<Order> extensionLoader = ExtensionLoader.getExtensionLoader(Order.class);
		Order alipay = extensionLoader.getExtension("alipay");
		System.out.println(alipay.way());
		Order weChat = extensionLoader.getExtension("wechat");
		System.out.println(weChat.way());
	}
}
