package com.psr.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages ="com.psr.app")
@SpringBootApplication
@EnableCaching
public class CoreAppApplication {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ConfigurableApplicationContext run = SpringApplication.run(CoreAppApplication.class, args);
	}
}
