package com.miracle.framework.remote.exchange;

import java.io.Serializable;

import lombok.Getter;

@Getter
public final class Response implements Serializable {
	
	private static final long serialVersionUID = 5887232731148682128L;
	
	private final long messageId;
	private final Object returnValue;
	private final Throwable exception;
	
	public Response(final long messageId, final Object returnValue) {
		this.messageId = messageId;
		this.returnValue = returnValue;
		this.exception = null;
	}
	
	public Response(final long messageId, final Throwable exception) {
		this.messageId = messageId;
		this.returnValue = null;
		this.exception = exception;
	}

	public long getMessageId() {
		return messageId;
	}
}
