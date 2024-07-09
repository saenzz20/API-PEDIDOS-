package tech.cognity.almacen.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR)
public class GeneralServiceException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GeneralServiceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GeneralServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public GeneralServiceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public GeneralServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public GeneralServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
