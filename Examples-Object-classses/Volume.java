import java.util.Scanner;

class Box
{
	int l,b,h;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dimensions :");
		l = sc.nextInt();
		b = sc.nextInt();
		h = sc.nextInt();
		System.out.println("Dimensions are: "+l+"x"+b+"x"+h);
	}
	int volume()
	{
		 return l*b*h;
	}
	void output(int vol)
	{
		System.out.println("Volume is: "+vol);
	}
}
public class Volume
{
	public static void main(String [] args)
	{
		int vol=0;
		Box b1 = new Box();
		b1.input();
		vol = b1.volume();
		b1.output(vol);
	}
}
