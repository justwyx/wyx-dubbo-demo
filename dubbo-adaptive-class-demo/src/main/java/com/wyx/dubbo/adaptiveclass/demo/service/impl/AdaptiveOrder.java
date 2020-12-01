package com.wyx.dubbo.adaptiveclass.demo.service.impl;

import com.wyx.dubbo.adaptiveclass.demo.service.Order;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.springframework.util.StringUtils;

/**
 * @author : Just wyx
 * @Date : 2020/12/1
 */
@Adaptive
public class AdaptiveOrder implements Order {
	private String defaultName;

	public void setDefaultName(String defaultName) {
		this.defaultName = defaultName;
	}

	@Override
	public String way() {
		ExtensionLoader<Order> extensionLoader = ExtensionLoader.getExtensionLoader(Order.class);
		Order order;
		if (StringUtils.isEmpty(defaultName)) {
			order = extensionLoader.getDefaultExtension();
		} else {
			order = extensionLoader.getExtension(defaultName);
		}
		return order.way();
	}
}
