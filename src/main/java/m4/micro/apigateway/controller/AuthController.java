package m4.micro.apigateway.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import m4.micro.apigateway.exception.NotImplemetedException;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@PostMapping("/login")
	public Object login() {
		throw new NotImplemetedException("Login endpoint");
	}

}
