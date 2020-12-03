package com.wyx.service;

import java.util.concurrent.CompletableFuture;

/**
 * @author : Just wyx
 * @Date : 2020/12/3
 */
public interface OtherService2 {
	String doFirst();
	String doSecond();

	CompletableFuture<String> doThird();
	CompletableFuture<String> doFourth();
}
