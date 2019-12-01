package m4.micro.apigateway.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Component
public class Info {
	
	private String message;
	private int gatewayPort;
	private int actuatorPort;
	private String actuatorUrl;
	
	public Info() {
		
		this.message = "API-Gateway is up and running..";
		this.gatewayPort = 8080;
		this.actuatorUrl = "http://localhost:9080/actuator";
		this.actuatorPort = 9080;
	}

}
