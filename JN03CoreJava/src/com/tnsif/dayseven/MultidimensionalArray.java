package com.tnsif.dayseven;

public class MultidimensionalArray {

	public static void main(String[] args) {
		int[][] a=new int[2][3];
		
		int b[][]= {{11,12,13,14},{21,22,23,24},{31,32,33,34}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+"\t");
			System.out.println();
		}

		for(int []aa:b)
		{
			for(int ele:aa)
				System.out.print(ele+"\t");
			System.out.println();
		}
		
	}

}
