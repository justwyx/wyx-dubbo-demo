package com.wyx.dubbo.activate.demo.service;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author : Just wyx
 * @Date : 2020/11/30
 */
@SPI()
public interface Order {
	String way();
}
