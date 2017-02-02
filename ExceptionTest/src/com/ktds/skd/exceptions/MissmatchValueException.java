package com.ktds.skd.exceptions;

//RuntimeException 상속 받은 후 alt + shift + s generate constructors from superclass
public class MissmatchValueException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3863943014256417477L;

	public MissmatchValueException() {
		super();
	}

	public MissmatchValueException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MissmatchValueException(String message, Throwable cause) {
		super(message, cause);
	}

	public MissmatchValueException(String message) {
		super(message);
	}

	public MissmatchValueException(Throwable cause) {
		super(cause);
	}

}
