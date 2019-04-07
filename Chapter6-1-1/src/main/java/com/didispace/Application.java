package com.didispace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.statemachine.StateMachine;

/**
 * 	使用Spring StateMachine框架实现状态机，比较难
 * 	启动服务后，整个购买流程就会自动跑完
 *
 * 	状态转移过程中，可以通过监听器（Listener）来处理一些持久化或者业务监控等任务。在需要持久化的场景中，
 * 	可以在状态机模式中的监听器中添加持久化的处理。
 */
@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private StateMachine<States, Events> stateMachine;

	@Override
	public void run(String... args) {
		stateMachine.start();
		stateMachine.sendEvent(Events.PAY);
		stateMachine.sendEvent(Events.RECEIVE);
	}

}
