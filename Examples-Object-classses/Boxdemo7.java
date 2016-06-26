/* Here Box class uses a parameterized constructor to
   initialise the Dimensions of a box.
*/

import java.util.*;

class Box {
   double width;
   double height;
   double depth;

   // this is the constructor for class Box.
   Box(double w, double h, double d) {
	width = w;
	height = h;
	depth = d;
   }

   // Display volume of a box
   void volume() {
	System.out.print("Volume is ");
	System.out.println( width * height * depth );
   }
}

class Boxdemo7 {
   public static void main(String args[]) {
	Box mybox1 = new Box(1,2,4);
	//Assign values to mybox1's instance variables
	mybox1.volume();

	System.out.println();

	Box mybox2 = new Box(10,12,10);
	//Assign Different values to mybox's instance variable
	mybox2.volume();
   }
}