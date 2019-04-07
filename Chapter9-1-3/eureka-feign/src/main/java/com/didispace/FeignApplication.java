package com.didispace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 	Spring Cloud构建微服务架构（三）断路器
 *
 * 	在分布式系统中，根据业务来拆分成一个个的微服务，服务与服务之间可以相互调用（RPC），
 * 	在spring cloud 中可以用RestTemplate+ribbon和feign来调用。为了保证其高可用，单个服务有时候会集群部署，
 * 	由于网络或程序自身的原因，服务并不能保证百分百可靠可用，如果单个服务出现问题，调用这个服务就出现线程阻塞，
 * 	此时若有大量的请求涌入，servlet容器的线程资源就会被消耗完毕导致服务瘫痪。服务与服务之间的依赖性，故障会传播，
 * 	会对整个微服务系统造成不可估量的严重后果，这就是常说的服务故障的“雪崩效应”。为了解决这个问题，
 * 	有人就提出了一种解决问题的思路，断路器模型。就是每一个调用服务的接口处加一个断路器，默认是关闭的，
 * 	当对服务调用时，不可用的次数达到一个阀值时，断路器就会打开，通过回调方法迅速返回一个值结束调用，避免出现连锁故障。
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignApplication.class, args);
	}

}
