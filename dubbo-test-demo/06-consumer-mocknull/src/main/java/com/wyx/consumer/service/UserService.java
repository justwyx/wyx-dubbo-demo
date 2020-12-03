package com.wyx.consumer.service;

/**
 * @author : Just wyx
 * @Date : 2020/12/3
 */
public interface UserService {
	String getUserNameById(int id);
	int getId();
	void addUser(String name);
}
