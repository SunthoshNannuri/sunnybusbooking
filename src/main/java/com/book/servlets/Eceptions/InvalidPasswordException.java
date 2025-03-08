package com.book.servlets.Eceptions;

public class InvalidPasswordException extends Exception{
	public InvalidPasswordException(String message)
	{
		super(message);
	}

}
