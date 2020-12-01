package com.wyx.dubbo.adaptive.method.demo.service;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : Just wyx
 * @Date : 2020/12/1
 */
@SpringBootTest
public class OrderTest {
	/**
	 * 通过 @Adaptive 方法，执行默认实现
	 * Order$Adaptive类就是自动生成的 adaptive类
	 */
	@Test
	public void test() {
		// 获取order扩展类的加载对象loader
		ExtensionLoader<Order> extensionLoader = ExtensionLoader.getExtensionLoader(Order.class);

		// 获取 order 接口的自适应扩展类实例
		Order adaptiveExtension = extensionLoader.getAdaptiveExtension();

		URL url = URL.valueOf("xxx://localhost/ooo");
		System.out.println(adaptiveExtension.pay(url)); // 支付-支付宝-pay()
	}

	/**
	 * 也可以通过url后面的参数 (?order=wechat)来指定要加载哪个实现类
	 */
	@Test
	public void test1() {
		// 获取order扩展类的加载对象loader
		ExtensionLoader<Order> extensionLoader = ExtensionLoader.getExtensionLoader(Order.class);

		// 获取 order 接口的自适应扩展类实例
		Order adaptiveExtension = extensionLoader.getAdaptiveExtension();

		URL url = URL.valueOf("xxx://localhost/ooo?order=wechat");
		System.out.println(adaptiveExtension.pay(url)); // 支付-微信-pay()
	}
}
