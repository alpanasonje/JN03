package com.tnsif.daysixteen;

public class UsingLambdaExpression {

	public static void main(String[] args) {
		Statement st=()->"Hello. How are you?";
		
		System.out.println(st.show());
		
		
		Message msg=(s)->System.out.println("welcome "+s);
		msg.display("JN03 Students");
		
		Cube c=(n)->n*n*n; 	
		System.out.println("Cube is "+c.calculate(5));
		
		INumber num=(no)->no%2!=0?true:false;
		System.out.println(num.isOdd(50));
		System.out.println(num.isOdd(55));
	}

}
