// This progrmas declears two Box objects

import java.util.*;

class Box {
   double width;
   double height;
   double depth;

   // this is the constructor for class Box.
   Box() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter width : ");
	width = sc.nextInt();
	System.out.println("Enter height : ");
	height = sc.nextInt();
	System.out.println("Enter depth : ");
	depth = sc.nextInt();
}

   // Display volume of a box
   void volume() {
	System.out.print("Volume is ");
	System.out.println( width * height * depth );
   }
}

class Boxdemo6 {
   public static void main(String args[]) {
	Box mybox1 = new Box();
	//Assign values to mybox1's instance variables
	mybox1.volume();

	System.out.println();

	Box mybox2 = new Box();
	//Assign Different values to mybox's instance variable
	mybox2.volume();
   }
}