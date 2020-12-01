package com.wyx.dubbo.adaptive.method.demo.service;

import org.apache.dubbo.common.extension.ExtensionLoader;

public class Order$Adaptive implements com.wyx.dubbo.adaptive.method.demo.service.Order {
	public java.lang.String pay(org.apache.dubbo.common.URL arg0) {
		if (arg0 == null) throw new IllegalArgumentException("url == null");
		org.apache.dubbo.common.URL url = arg0;
		String extName = url.getParameter("order", "alipay");
		if (extName == null)
			throw new IllegalStateException("Failed to get extension (com.wyx.dubbo.adaptive.method.demo.service.Order) name from url (" + url.toString() + ") use keys([order])");
		com.wyx.dubbo.adaptive.method.demo.service.Order extension = (com.wyx.dubbo.adaptive.method.demo.service.Order) ExtensionLoader.getExtensionLoader(com.wyx.dubbo.adaptive.method.demo.service.Order.class).getExtension(extName);
		return extension.pay(arg0);
	}

	public java.lang.String way() {
		throw new UnsupportedOperationException("The method public abstract java.lang.String com.wyx.dubbo.adaptive.method.demo.service.Order.way() of interface com.wyx.dubbo.adaptive.method.demo.service.Order is not adaptive method!");
	}
}