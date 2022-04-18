package com.exam.exception;

public class ISBNDoesNotExistsException extends RuntimeException {
	public ISBNDoesNotExistsException() {
		super();
	}

	public ISBNDoesNotExistsException(String message) {
		super(message);

	}

}
