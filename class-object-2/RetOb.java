// Returning an object.

class Test 
{
	int a;
	Test(int i) 
	{
		a = i;
	}
	Test incrByTen(int a) 
	{
		Test temp = new Test(this.a+10);
		return temp;
	}
}

class RetOb 
{
	public static void main(String args[]) 
	{
		Test ob1 = new Test(2);
		Test ob2;
		ob2 = ob1.incrByTen(20);
		System.out.println("ob1.a: " + ob1.a);
		System.out.println("ob2.a: " + ob2.a);
		//ob2 = ob2.incrByTen();
		//System.out.println("ob2.a after second increase: "+ ob2.a);
	}
}