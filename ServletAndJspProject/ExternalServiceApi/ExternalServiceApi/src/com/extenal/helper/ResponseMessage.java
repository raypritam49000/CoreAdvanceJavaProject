package com.extenal.helper;

public class ResponseMessage {
	private String message;
	private boolean success;

	public ResponseMessage(String message, boolean success) {
		super();
		this.message = message;
		this.success = success;
	}

	public ResponseMessage() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	@Override
	public String toString() {
		return "ResponseMessage [message=" + message + ", success=" + success + "]";
	}

}
