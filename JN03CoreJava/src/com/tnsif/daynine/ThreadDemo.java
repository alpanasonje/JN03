package com.tnsif.daynine;

public class ThreadDemo {
	public static void fibonacci(int n)
	{
		int f0=0, f1=1, f2;
		
		System.out.println(Thread.currentThread()+"Fibonacci term : "+f0);
		System.out.println(Thread.currentThread()+"Fibonacci term : "+f1);
		for(int i=1;i<=n-2;i++)
		{
			f2=f0+f1;
			System.out.println(Thread.currentThread()+"Fibonacci term : "+f2);
			f0=f1;
			f1=f2;
		}
	}
	public static void generatePrime(int n)
	{
		int no=2, j;
		for(int i=1;i<=n;)
		{
			for(j=2;j<no;j++)
			{
				if (no%j==0)
					break;
			}
			if (j==no)
			{
				System.out.println("\t\tPrime Number : "+no+Thread.currentThread());
				i++;
			}
			no++;
		}
		
	}
	public static void main(String[] args) {
		System.out.println("-------------In main()-------------");
		System.out.println(Thread.currentThread());
		
		ChildThreadOne t1=new ChildThreadOne();
		ChildThreadTwo t2=new ChildThreadTwo();
		t1.start();
	//	t1.start(); IllegalThreadStateException
		t2.start();
		
		//Application is single threaded
		//t1.run();
		//t2.run();
		
		
		/*
		 * MyChildThread mt1=new MyChildThread("First"); MyChildThread mt2=new
		 * MyChildThread("Second"); MyChildThread mt3=new MyChildThread("Third");
		 * MyChildThread mt4=new MyChildThread("Fourth"); MyChildThread mt5=new
		 * MyChildThread("Fifth");
		 */
		
		System.out.println("-------------End of main()-------------");
	}

}
