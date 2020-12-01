package com.wyx.dubbo.activate.demo.service;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author : Just wyx
 * @Date : 2020/12/1
 */
@SpringBootTest
public class ActivateTest {

	/**
	 * 激活group为 online的所有扩展类
	 * 结果
	 * 		支付方式-微信-way()
	 * 		支付方式-银行卡-way()
	 * 支付宝也是线上，但支付宝指定了value，范转最终以小的为准
	 */
	@Test
	public void test() {
		// 获取 order spi接口的 ExtensionLoader
		ExtensionLoader<Order> extensionLoader = ExtensionLoader.getExtensionLoader(Order.class);

		URL url = URL.valueOf("xxx://localhost/ooo");
		// 激活group为 online的所有扩展类
		List<Order> onlines = extensionLoader.getActivateExtension(url, "", "online");

		for (Order order : onlines) {
			System.out.println(order.way());
		}
	}

	/**
	 * 通过 url 指定key(?key=alipay),
	 * getActivateExtension(url, "key", "online") 的 key 与 group是与的关系
	 * 结果
	 * 		支付方式-微信-way()
	 * 		支付方式-银行卡-way()
	 * 		支付方式-支付宝-way()
	 */
	@Test
	public void test1() {
		// 获取 order spi接口的 ExtensionLoader
		ExtensionLoader<Order> extensionLoader = ExtensionLoader.getExtensionLoader(Order.class);

		URL url = URL.valueOf("xxx://localhost/ooo?key=alipay");
		// 激活group为 online的所有扩展类
		List<Order> onlines = extensionLoader.getActivateExtension(url, "key", "online");

		for (Order order : onlines) {
			System.out.println(order.way());
		}
	}
}
