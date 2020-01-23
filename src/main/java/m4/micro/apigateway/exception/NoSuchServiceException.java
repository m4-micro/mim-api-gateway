package m4.micro.apigateway.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class NoSuchServiceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1798972121442942585L;

	public NoSuchServiceException() {
		super();
	}

	public NoSuchServiceException(String s) {
		super(s);
	}

}
