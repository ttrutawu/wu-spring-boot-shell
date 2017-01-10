package com.wheelsup.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wheelsup.service.IWheelsUpService;

@Service
public class WheelsUpService implements IWheelsUpService{

	@Value("${name:World}")
	private String name;

	public String getHelloMessage() throws Exception {
		return "Hello " + this.name;
	}

}
