package com.tnsif.dayfive.overriding.covariant;

public class Child extends Base {
	@Override
	public Child show()
	{
		return this;	
	}
	
}
