package com.wyx.dubbospidemo.service2;

import org.apache.dubbo.common.extension.ExtensionLoader;

public class GoodsOrder$Adaptive implements com.wyx.dubbospidemo.service2.GoodsOrder {
	public java.lang.String way() {
		throw new UnsupportedOperationException("The method public abstract java.lang.String com.wyx.dubbospidemo.service2.GoodsOrder.way() of interface com.wyx.dubbospidemo.service2.GoodsOrder is not adaptive method!");
	}

	public void pay(org.apache.dubbo.common.URL arg0) {
		if (arg0 == null) throw new IllegalArgumentException("url == null");
		org.apache.dubbo.common.URL url = arg0;
		String extName = url.getParameter("goods.order", "alipay");
		if (extName == null)
			throw new IllegalStateException("Failed to get extension (com.wyx.dubbospidemo.service2.GoodsOrder) name from url (" + url.toString() + ") use keys([goods.order])");
		com.wyx.dubbospidemo.service2.GoodsOrder extension = (com.wyx.dubbospidemo.service2.GoodsOrder) ExtensionLoader.getExtensionLoader(com.wyx.dubbospidemo.service2.GoodsOrder.class).getExtension(extName);
		extension.pay(arg0);
	}
}