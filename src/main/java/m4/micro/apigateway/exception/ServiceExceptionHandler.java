package m4.micro.apigateway.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ServiceExceptionHandler {
	
	
	@ExceptionHandler
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public String handleNoSuchServiceException(NoSuchServiceException exception) {
		
		return exception.getMessage();
		
	}

}
