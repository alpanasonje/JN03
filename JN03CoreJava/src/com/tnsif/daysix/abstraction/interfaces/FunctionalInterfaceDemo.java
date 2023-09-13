package com.tnsif.daysix.abstraction.interfaces;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		//Using Anonymous class
		Cube c=new Cube() {	
			@Override
			public float calculate(int no) {
				return no*no*no;
			}
		};
		System.out.println(c.calculate(5));
		
		//Using Lambda Expression
		//Cube c1=(int no)->{return (no*no*no);};
		
		Cube c1=(int no)->no*no*no;
		System.out.println(c1.calculate(7));
	}

}
