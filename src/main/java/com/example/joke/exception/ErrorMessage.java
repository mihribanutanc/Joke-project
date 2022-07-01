package com.example.joke.exception;

import lombok.Getter;

import java.util.Date;

@Getter
public class ErrorMessage {
	private int code;
	private String message;
	private String description;
	private Date timestamp;

	public ErrorMessage(int code,String message,String description,Date timestamp){
		this.code=code;
		this.message=message;
		this.description=description;
		this.timestamp=timestamp;
	}
}
