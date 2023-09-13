package com.tnsif.dayseven;

public class JaggedArray {

	public static void main(String[] args) {
		
		int b[][]= {{11},{21,22,23,24},{31,32,33},{41,42}};
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
				System.out.print(b[i][j]+"\t");
			System.out.println();
		}
		
		int c[][]=new int[2][];
		c[0]=new int[4];
		c[1]= new int[]{10,20};

		for(int []aa:c)
		{
			for(int ele:aa)
				System.out.print(ele+"\t");
			System.out.println();
		}
		
	}

}
