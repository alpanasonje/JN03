//Program to demonstrate generic constructors
package com.tnsif.dayfifteen.generics;

public class GenericConstructors{
private double v;


//Generic Constructors
public <T extends Number>GenericConstructors(T t)
{
	v=t.doubleValue();
	
}

void show()
{
	System.out.println("Value of v in double type is: "+v);
}

}