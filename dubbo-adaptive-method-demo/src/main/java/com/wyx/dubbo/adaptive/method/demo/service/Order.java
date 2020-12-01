package com.wyx.dubbo.adaptive.method.demo.service;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author : Just wyx
 * @Date : 2020/12/1
 */
@SPI("alipay")
public interface Order {
	String way();

	@Adaptive
	String pay(URL url);
}
