package io.hotel.excption;

public class RoomException extends RuntimeException{
	
private static final long serialVersionUID = 1L;
	
	public RoomException() {
		super();
	}

	
	public RoomException(String message) {
		super(message);
	}


}
