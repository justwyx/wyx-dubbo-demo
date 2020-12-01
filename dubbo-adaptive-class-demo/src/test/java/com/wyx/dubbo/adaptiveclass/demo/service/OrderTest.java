package com.wyx.dubbo.adaptiveclass.demo.service;

import com.wyx.dubbo.adaptiveclass.demo.service.impl.AdaptiveOrder;
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
	 * 通过 @Adaptive 注解到类，调用默认的实现类
	 */
	@Test
	public void test() {
		// 获取order扩展类的加载对象loader
		ExtensionLoader<Order> extensionLoader = ExtensionLoader.getExtensionLoader(Order.class);
		// 获取Order接口的自适应扩展类实例(加载默认扩展类)
		Order adaptiveExtension = extensionLoader.getAdaptiveExtension();
		System.out.println(adaptiveExtension.way()); // 支付方式-支付宝-way()
	}

	/**
	 * 也可以通过手动指定的方式来指定
	 * ((AdaptiveOrder)adaptiveExtension).setDefaultName("wechat");
	 */
	@Test
	public void test1() {
		// 获取order扩展类的加载对象loader
		ExtensionLoader<Order> extensionLoader = ExtensionLoader.getExtensionLoader(Order.class);
		// 获取Order接口的自适应扩展类实例(加载默认扩展类)
		Order adaptiveExtension = extensionLoader.getAdaptiveExtension();
		// 手动指定实现类
		((AdaptiveOrder)adaptiveExtension).setDefaultName("wechat");
		System.out.println(adaptiveExtension.way()); // 支付方式-微信-way()
	}
}
