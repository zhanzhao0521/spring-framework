package com.zhanzhao.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public User user(){
		return	new User("zhangsan");
	}
}
