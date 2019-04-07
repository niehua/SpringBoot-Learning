package com.didispace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 	实现邮件发送：简单邮件、附件邮件、嵌入资源的邮件、模板邮件
 * 	使用的是spring-boot-starter-mail模块
 * 	测试失败，原因待查
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
