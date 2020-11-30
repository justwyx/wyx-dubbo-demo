package com.wyx.dubbospidemo.service;

import org.apache.dubbo.common.extension.ExtensionLoader;

public class Order$Adaptive implements com.wyx.dubbospidemo.service.Order {
	public java.lang.String way() {
		throw new UnsupportedOperationException("The method public abstract java.lang.String com.wyx.dubbospidemo.service.Order.way() of interface com.wyx.dubbospidemo.service.Order is not adaptive method!");
	}

	public void pay(org.apache.dubbo.common.URL arg0) {
		if (arg0 == null) throw new IllegalArgumentException("url == null");
		org.apache.dubbo.common.URL url = arg0;
		String extName = url.getParameter("order", "alipay");
		if (extName == null)
			throw new IllegalStateException("Failed to get extension (com.wyx.dubbospidemo.service.Order) name from url (" + url.toString() + ") use keys([order])");
		com.wyx.dubbospidemo.service.Order extension = (com.wyx.dubbospidemo.service.Order) ExtensionLoader.getExtensionLoader(com.wyx.dubbospidemo.service.Order.class).getExtension(extName);
		extension.pay(arg0);
	}
}