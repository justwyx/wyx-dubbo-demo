package com.wyx.dubbospidemo;

import com.wyx.dubbospidemo.service.Order;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : Just wyx
 * @Date : 2020/11/30
 */
@SpringBootTest
public class OrderTest {
	@Test
	public void test() {
		ExtensionLoader<Order> extensionLoader = ExtensionLoader.getExtensionLoader(Order.class);
		Order alipay = extensionLoader.getExtension("alipay");
		System.out.println(alipay.way());
		Order weChat = extensionLoader.getExtension("weChat");
		System.out.println(weChat.way());

		// 自定义名字也行
		Order xxx = extensionLoader.getExtension("xxx");
		System.out.println(xxx.way());
	}

	/**
	 * 测试默认不指定的情况
	 */
	@Test
	public void testDefault() {
		ExtensionLoader<Order> extensionLoader = ExtensionLoader.getExtensionLoader(Order.class);
		// 一般不会这样使用，推荐性用法是使用 adaptive
		Order alipay = extensionLoader.getExtension("true");
		System.out.println(alipay.way());
	}


	/**
	 * 使用默认机制
	 */
	@Test
	public void testDefault1() {
		// 获取order自适合实例
		ExtensionLoader<Order> extensionLoader = ExtensionLoader.getExtensionLoader(Order.class);
		URL url = URL.valueOf("xxx://localhost:8888/qqq/www");
		Order alipay = extensionLoader.getAdaptiveExtension();
		alipay.pay(url);
	}

	/**
	 * 通过url指定使用weChat (?order=weChat)
	 */
	@Test
	public void testDefault2() {
		// 获取order自适合实例
		ExtensionLoader<Order> extensionLoader = ExtensionLoader.getExtensionLoader(Order.class);
		URL url = URL.valueOf("xxx://localhost:8888/qqq/www?order=weChat");
		Order alipay = extensionLoader.getAdaptiveExtension();
		alipay.pay(url);
	}
}
