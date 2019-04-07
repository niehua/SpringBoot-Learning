package com.didispace;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 	Spring Cloud构建微服务架构（一）——服务注册与发现  http://localhost:2222/add?a=1&b=1
 *
 * 	先启动eureka-server服务，它作为一个注册中心，再启动服务compute_server，最后浏览器输入以上网址
 * 	（否则直接启动compute_server会报错registration failed Cannot execute request on any known server）
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ComputeServiceApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ComputeServiceApplication.class).web(true).run(args);
	}

}
