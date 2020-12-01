package com.wyx.dubbo.spi.demo.service;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : Just wyx
 * @Date : 2020/11/30
 */
@SpringBootTest
public class OrderTest {
	/**
	 * 根据 getExtension("name") 指定实现类
	 */
	@Test
	public void test() {
		ExtensionLoader<Order> extensionLoader = ExtensionLoader.getExtensionLoader(Order.class);
		Order alipay = extensionLoader.getExtension("alipay"); // 支付方式-支付宝-way()
		System.out.println(alipay.way());
		Order weChat = extensionLoader.getExtension("wechat"); // 支付方式-微信-way()
		System.out.println(weChat.way());
		// 自定义名字也行
		Order xxx = extensionLoader.getExtension("xxx"); // 支付方式-微信-way()
		System.out.println(xxx.way());
	}

	/**
	 * 测试默认不指定的情况,
	 */
	@Test
	public void testDefault() {
		ExtensionLoader<Order> extensionLoader = ExtensionLoader.getExtensionLoader(Order.class);
		// 一般不会这样使用，推荐性用法是使用 adaptive
		Order alipay = extensionLoader.getExtension("true"); //支付方式-支付宝-way()
		System.out.println(alipay.way());
	}
}
