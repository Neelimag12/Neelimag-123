package com.exam.exception;

public class BookAlreadyIssuedException extends RuntimeException {
	public BookAlreadyIssuedException() {
		super();
	}

	public BookAlreadyIssuedException(String message) {
		super(message);

	}


}
