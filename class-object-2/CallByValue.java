// Primitive types are passed by value.

class Test 
{
	void alter(int i, int j) 
	{
		i *= 2;		
		j /= 2;
	}
}

class CallByValue 
{
	public static void main(String args[]) 
	{
		Test ob = new Test();
		int a = 15, b = 20;
		System.out.println("a and b before call: " +
		a + " " + b);
		ob.alter(a, b);
		System.out.println("a and b after call: " +
		a + " " + b);
	}
}