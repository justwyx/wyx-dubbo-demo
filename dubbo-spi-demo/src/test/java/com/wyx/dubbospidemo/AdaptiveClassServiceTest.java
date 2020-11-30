package com.wyx.dubbospidemo;

import com.wyx.dubbospidemo.adaptiveClassService.Order;
import com.wyx.dubbospidemo.adaptiveClassService.impl.AdaptiveOrder;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 用于测试 @Adaptive类
 * @author : Just wyx
 * @Date : 2020/11/30
 */
@SpringBootTest
public class AdaptiveClassServiceTest {

	/**
	 * 通过AdaptiveOrder指定默认对象
	 */
	@Test
	public void test() {
		ExtensionLoader<Order> extensionLoader = ExtensionLoader.getExtensionLoader(Order.class);
		Order order = extensionLoader.getAdaptiveExtension();
		System.out.println(order.way()); // 支付宝支付方式
	}

	/**
	 * 手动指定
	 */
	@Test
	public void test1() {
		ExtensionLoader<Order> extensionLoader = ExtensionLoader.getExtensionLoader(Order.class);
		Order order = extensionLoader.getAdaptiveExtension();
		((AdaptiveOrder)order).setDefaultName("weChat");
		System.out.println(order.way()); //微信支付方式
	}
}
