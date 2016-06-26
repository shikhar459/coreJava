// Demonstrate static variables, methods, and blocks.

class UseStatic 
{
	static int a = 3;	
	static int b;
	static int p=10;
	
	static void display(int x) 
	{
		System.out.println("x = " + x);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	static void changeStatic()
	{
		a=10;
		System.out.println(a);
	}

	static 
	{
		System.out.println("Static block initialized.");
		b = a * 4;
	}
	
	public static void main(String args[]) 
	{
		display(42);
		changeStatic();
		System.out.println(a);
	}
}


		
		//To access non static members, we need an object.

		//UseStatic u1 = new UseStatic();
		//System.out.println(++(u1.p));
		//UseStatic u2 = new UseStatic();
		//System.out.println(u2.p);
		
	//}
//}