package com.didispace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 	使用LDAP来统一管理用户信息
 * 	每次新项目的开发，都需要重新开发和维护一套用户密码，而“LDAP统一认证服务，可以达到LDAP的单点登录认证
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
