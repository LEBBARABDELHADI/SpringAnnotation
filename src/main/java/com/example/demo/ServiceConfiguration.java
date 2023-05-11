package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.Service.ServiceA;
import com.example.demo.Service.ServiceB;
import com.example.demo.composants.MonComposant;

@Configuration
public class ServiceConfiguration {

	@Bean
	public ServiceA serviceA() {
		return new ServiceA();
	}
	@Bean
	public ServiceB serviceB() {
		return new ServiceB();
	}
	@Bean
	public MonComposant monComposant() {
		MonComposant monComposant = new MonComposant(serviceA());
		monComposant.setService1(new ServiceB());
		return monComposant;
	}
}
