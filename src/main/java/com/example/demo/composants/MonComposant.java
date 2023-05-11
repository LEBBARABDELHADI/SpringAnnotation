package com.example.demo.composants;

import com.example.demo.Service.Service;

public class MonComposant implements IComposant {

	Service service;
	Service service1;

	public MonComposant(Service service) {
		this.service = service;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return service.name() + service1.name();
	}

	public void setService1(Service service1) {
		this.service1 = service1;
	}

}
