import java.util.*;

public class test
{
	void sum(int i, int j)
	{
		System.out.println("1st");
		System.out.println("sum is :"+(i+j));	
	}
	void sum(long i, long j)
	{
		System.out.println("2nd");
		System.out.println("sum is :"+(i+j));	
	}
	public static void main(String [] args)
	{
		test t = new test();
		t.sum(10L,20L);
	}
}
