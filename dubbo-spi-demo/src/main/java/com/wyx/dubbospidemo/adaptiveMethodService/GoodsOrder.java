package com.wyx.dubbospidemo.adaptiveMethodService;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author : Just wyx
 * @Date : 2020/11/30
 */
@SPI("alipay")
public interface GoodsOrder {
	String way();

	@Adaptive
	void pay(URL str);
}
