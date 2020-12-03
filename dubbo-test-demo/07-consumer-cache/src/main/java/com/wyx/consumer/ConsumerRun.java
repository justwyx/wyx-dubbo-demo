package com.wyx.consumer;

import com.wyx.service.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Just wyx
 * @Date : 2020/11/24
 */
public class ConsumerRun {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-consumer.xml");
		SomeService service = (SomeService) ac.getBean("someService");

		service.hello("China");
		service.hello("USA");
		service.hello("China");
		service.hello("USA");

	}
}
