package com.wyx.dubbospidemo;

import com.wyx.dubbospidemo.adaptiveMethodService.GoodsOrder;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 用于测试 @Adaptive方法
 * @author : Just wyx
 * @Date : 2020/11/30
 */
@SpringBootTest
public class AdaptiveMethodServiceTest {
	@Test
	public void test() {
		ExtensionLoader<GoodsOrder> extensionLoader = ExtensionLoader.getExtensionLoader(GoodsOrder.class);
		GoodsOrder alipay = extensionLoader.getExtension("alipay");
		System.out.println(alipay.way());
		GoodsOrder weChat = extensionLoader.getExtension("weChat");
		System.out.println(weChat.way());
	}


	/**
	 * 使用默认机制
	 */
	@Test
	public void testDefault1() {
		// 获取order自适合实例
		ExtensionLoader<GoodsOrder> extensionLoader = ExtensionLoader.getExtensionLoader(GoodsOrder.class);
		URL url = URL.valueOf("xxx://localhost:8888/qqq/www");
		GoodsOrder alipay = extensionLoader.getAdaptiveExtension();
		alipay.pay(url);
	}

	/**
	 * 通过url指定使用weChat (?order=weChat)
	 */
	@Test
	public void testDefault2() {
		// 获取order自适合实例
		ExtensionLoader<GoodsOrder> extensionLoader = ExtensionLoader.getExtensionLoader(GoodsOrder.class);
		/**
		 * 注意这里（?goods.order=weChat）
		 */
		URL url = URL.valueOf("xxx://localhost:8888/qqq/www?goods.order=weChat");
		GoodsOrder alipay = extensionLoader.getAdaptiveExtension();
		alipay.pay(url);
	}
}
