//Program to define user defined exception class (CheckedException)
package com.tnsif.dayeight;

public class InvalidPercentageException extends Throwable{
	public InvalidPercentageException()
	{
		super("Percentage should not exceed 100 or should not be below 0");
	}
	
	public InvalidPercentageException(String message)
	{
		super(message);
	}
}
