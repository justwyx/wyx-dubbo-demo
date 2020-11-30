package com.wyx.dubbospidemo.adaptiveClassService;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author : Just wyx
 * @Date : 2020/11/30
 */
@SPI("alipay")
public interface Order {
	String way();

}
