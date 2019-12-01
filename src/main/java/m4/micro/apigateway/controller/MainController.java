package m4.micro.apigateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import m4.micro.apigateway.model.Info;

@RestController
public class MainController {
	
	@Autowired
	Info info;
	
	@GetMapping("/")
	public Object getStatus() {
		return info;
		
	}

}
