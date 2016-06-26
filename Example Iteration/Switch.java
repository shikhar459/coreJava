//to display numbers in words

import java.util.*;

public class Switch
{
	public static void main(String [] args)
	{
		int num;		// 1,2,3
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		num = sc.nextInt();
		
		switch(num)
		{
			case 1: System.out.println("ONE"); 
				break;
			case 2: System.out.println("TWO"); 
				break;
			case 3: System.out.println("THREE"); 
				break;
			default: System.out.println("INVALID NUMBER..."); 
				break;
		}
	}
}