// This progrmas declears two Box objects

class Box {
    double width;
    double height;
    double depth;
}

class Boxdemo2 {
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

        //Compute volume for First Box
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Volume of Fist box is : " + vol);

        //Compute volume for Second Box
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Volume of Second box is : " + vol);
    }
}