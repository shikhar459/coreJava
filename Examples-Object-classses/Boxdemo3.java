// This progrmas declears two Box objects

class Box {
    double width;
    double height;
    double depth;

    // Display volume of a box
    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }
}

class Boxdemo3 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //Assign values to mybox1's instance variables
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 10;

        //Assign Different values to mybox's instance variable
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //Display volume for First Box
        mybox1.volume();

        //Display volume for Second Box
        mybox2.volume();
    }
}