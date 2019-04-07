package com.didispace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 *
 * 	使用Spring Security进行安全控制，完成必须登录才能访问站内地址，直接访问站内地址会被打到登录界面，
 * 	以前做教务系统时也实现过，通过判断sesssion是否有效决定用户是否已登录，
 * 	但没有这个简约，他这个相当于把判断session的逻辑抽了出来，每次访问后端控制器都会被拦截并判断是否登录，如果登录才会跳到请求页面
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}

}
