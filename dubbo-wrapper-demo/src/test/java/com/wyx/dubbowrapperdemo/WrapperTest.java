package com.wyx.dubbowrapperdemo;

import com.wyx.dubbowrapperdemo.service.Order;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author : Just wyx
 * @Date : 2020/11/30
 */
@SpringBootTest
public class WrapperTest {

	@Test
	public void test() {
		ExtensionLoader<Order> extensionLoader = ExtensionLoader.getExtensionLoader(Order.class);
		Order alipay = extensionLoader.getExtension("alipay");
		System.out.println(alipay.way());
		Order weChat = extensionLoader.getExtension("weChat");
		System.out.println(weChat.way());
	}
}
