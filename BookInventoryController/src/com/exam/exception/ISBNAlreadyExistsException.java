package com.exam.exception;

public class ISBNAlreadyExistsException extends RuntimeException  {
	public ISBNAlreadyExistsException() {
		super();
	}

	public ISBNAlreadyExistsException(String message) {
		super(message);

	}

}
