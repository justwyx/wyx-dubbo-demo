package com.wyx.consumer.service;

/**
 * @author : Just wyx
 * @Date : 2020/12/3
 */
public class UserServiceMock implements UserService{
	@Override
	public String getUserNameById(int id) {
		return "服务失败";
	}

	@Override
	public int getId() {
		return -1;
	}

	@Override
	public void addUser(String name) {
		System.out.println("addUser（）调用失败");
	}
}
