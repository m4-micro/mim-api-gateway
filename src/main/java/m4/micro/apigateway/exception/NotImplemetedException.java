package m4.micro.apigateway.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)

public class NotImplemetedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6881681095841692716L;

	public NotImplemetedException() {
		super();

	}

	public NotImplemetedException(String s) {
		super(s);

	}

}
