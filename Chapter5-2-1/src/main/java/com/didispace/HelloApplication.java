package com.didispace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 	Spring Boot中使用RabbitMQ
 * 	测试失败，感觉应该需要在网上注册一下，或者是缺什么东西 Connection refused: connect
 */
@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
