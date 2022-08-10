package io.user.exception;

public class UserNotFound extends RuntimeException{
	
private static final long serialVersionUID = 1L;
	
	public UserNotFound() {
		super();
	}

	
	public UserNotFound(String message) {
		super(message);
	}


}
