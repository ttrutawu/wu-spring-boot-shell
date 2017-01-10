package com.wheelsup.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wheelsup.service.IWheelsUpService;

@RestController
public class WheelsUpController {
 
	@Autowired
	private IWheelsUpService wheelsUpService;
 
	@GetMapping("/hello")
	@ResponseBody
	public String helloWorld() throws Exception{
		return wheelsUpService.getHelloMessage();
	}
	
	@PostMapping("/hellopost")
	@ResponseBody
	public String helloWorldPost(@RequestBody String json) throws Exception{
		return json;
	}

}
