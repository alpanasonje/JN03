package com.tnsif.daythree;

public class Derived extends Base{
	@Override
	public void greet()
	{
		System.out.println("Good Afternoon Students!!!\nHope you are doing well");
	}
	
	//final method can't be override
	/*@Override
	public final void show()
	{
		System.out.println("C2TC JFS Training");
	}*/
}
