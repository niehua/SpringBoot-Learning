package com.didispace;

/**
 *	工程整理
 *
 *  iml 文件是IntelliJ IDEA 自动创建的模块文件，用于Java应用开发，存储一些模块开发相关的信息，比如一个Java组件，
 * 插件组件，Maven组件等等， 还可能会存储一些模块路径信息，依赖信息以及别的一些设置。
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public DataLoader dataLoader() {
        return new DataLoader();
    }

    @Slf4j
    static class DataLoader implements CommandLineRunner {

        @Override
        public void run(String... strings) throws Exception {
            log.info("Loading data...");
        }
    }

}
