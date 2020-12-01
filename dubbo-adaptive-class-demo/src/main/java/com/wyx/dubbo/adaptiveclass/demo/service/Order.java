package com.wyx.dubbo.adaptiveclass.demo.service;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author : Just wyx
 * @Date : 2020/12/1
 */
@SPI("alipay")
public interface Order {
	String way();
}
