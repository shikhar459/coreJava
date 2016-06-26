

// Demonstrate an inner class.

class Outer 
{
	private int outer_x = 100;
	private void test() 
	{
		Inner inner = new Inner();
		inner.display();
	}
	
	// this is an inner class

	class Inner 
	{
		private void display() 
		{
			System.out.println("display: outer_x = " + outer_x);
		}
	}
}

class InnerClassDemo 
{
	public static void main(String args[]) 
	{
		Outer outer = new Outer();
		outer.test();
	}
}