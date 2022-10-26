package com.weweb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.weweb.interceptors.LoginInterceptor;

@Configuration
@ComponentScan(basePackages = {"com.weweb.interceptors"})
public class WebMvcConfiguration implements WebMvcConfigurer {
	
	@Autowired
	LoginInterceptor loginInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		System.out.println("login check Interceptor 동작");
		registry.addInterceptor(loginInterceptor).addPathPatterns("/member/mypage");
	}
	
	

}
