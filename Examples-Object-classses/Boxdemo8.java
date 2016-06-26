/* Here Box class uses a parameterized constructor to
   initialise the Dimensions of a box.
*/

import java.util.*;

class Box {
   double width;
   double height;
   double depth;

   // this is the constructor for class Box.
   Box(double width, double height, double depth) {
	this.width = width;
	this.height = height;
	this.depth = depth;
   }

   // Display parameters
   void display() {
	System.out.println("width : " + width);
	System.out.println("height : " + height);
	System.out.println("depth : " + depth);
   }

   // Display volume of a box
   void volume() {
	System.out.print("Volume is ");
	System.out.println( width * height * depth );
   }
}

class Boxdemo8 {
   public static void main(String args[]) {
	Box mybox1 = new Box(1,2,4);

	// To display Parameters
	mybox1.display();

	//Assign values to mybox1's instance variables
	mybox1.volume();

	System.out.println();
   }
}
