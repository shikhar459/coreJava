import java.util.*;

class stackFunc
{
	int stk[] = new int[10];
	int tos;
	
	stackFunc()
	{
		tos = -1;
	}

	void push(int item)
	{
		if(tos==9)
		{
			System.out.println("Your stack is already full.. No values can be pushed..");
		}
		else
		{
			stk[++tos]=item;
		}
	}
	void pop()
	{
		if(tos<0)
		{
			System.out.println("Your stack is empty.. No values can be popped..");
		}
		else
		{
			--tos;
		}
	}
	void traverse()
	{
		if(tos<0)
		{
			System.out.println("Stack is empty...");
		}
		else
		{
			System.out.print("Current contents of stack are :" );
			for(int i=0;i<=tos;i++)
			{
				System.out.print("  "+stk[i]);
			}
			System.out.println();
		}
	}
}

class stack
{
	public static void main(String [] args)
	{
		stackFunc s = new stackFunc();
		int choice = 0, num;
		char ch='n';
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome..\n\nWe have a stack here...\n");
		do
		{
		
			System.out.println("Enter operation : \n1. Push \n2. Pop \n3.Traverse");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1: System.out.println("Enter a number to push :");
					num = sc.nextInt();
					s.push(num);
					break;	
				case 2: s.pop();
					break;
				case 3: s.traverse();
					break;
				default: System.out.println("You have entered a wrong choice"); 
			}
			System.out.println("Do you want to continue?? (y/n)");
			ch = sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		System.out.println("....Thankyou....");
	}
}

