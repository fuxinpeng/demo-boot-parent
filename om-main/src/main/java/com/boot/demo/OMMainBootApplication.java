package com.boot.demo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableDubbo
@MapperScan(value="com.boot.demo.mapper")//mybaits扫描映射器
@SpringBootApplication
public class OMMainBootApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(OMMainBootApplication.class, args);
	}
	
}
