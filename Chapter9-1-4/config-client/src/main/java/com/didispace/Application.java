package com.didispace;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * 	Spring Cloud构建微服务架构（四）分布式配置中心
 * 	应该就是在网上单独配置，与工程代码分开来，方便灵活的切换不同配置（测试，生产，开发）
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).web(true).run(args);
	}

}
