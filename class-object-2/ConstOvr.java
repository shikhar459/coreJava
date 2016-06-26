import java.util.Scanner;


public class ConstOvr
{
	int l,b,h;
	ConstOvr()
	{
		l=0; b=0; h=0;
	}
	ConstOvr(int length, int breadth, int height)
	{
		l=length; b=breadth; h=height;
	}
	int volume()
	{
		return l*b*h;
	}
	public static void main(String [] args)
	{
		ConstOvr c = new ConstOvr(10,20,30);
		int v;
		v = c.volume();
		System.out.println("Volume is: "+v);
	}
}


