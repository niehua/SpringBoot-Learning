package com.didispace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 	使用AOP统一处理Web请求日志, 通过启动容用器浏览器测试
 * 	这里切面的作用：在处理前端请求之前和处理完之后分别log一些请求信息，所以感觉可应用于日志记录，请求过滤等方面
 * 	他面向切面编程，也就是说不改变原来代码的基础上增加了一些功能
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
