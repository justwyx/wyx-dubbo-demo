package com.wyx.consumer;

import com.wyx.consumer.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Just wyx
 * @Date : 2020/11/24
 */
public class ConsumerRun {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-consumer.xml");
		UserService service = (UserService) ac.getBean("userService");
		// 返回String
		String username = service.getUserNameById(1);
		System.out.println("username:" + username); // username:服务失败

		// 返回基本类型
		int id = service.getId();
		System.out.println("id:" + id); // id:-1

//		 无返回值
		service.addUser("wyx"); // addUser（）调用失败
	}
}
