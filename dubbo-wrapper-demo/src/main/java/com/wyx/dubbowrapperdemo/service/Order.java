package com.wyx.dubbowrapperdemo.service;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author : Just wyx
 * @Date : 2020/11/30
 */
@SPI("alipay")
public interface Order {
	String way();

	void pay(URL str);
}
