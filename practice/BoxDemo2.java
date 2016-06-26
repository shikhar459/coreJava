// This progrmas declears two Box objects

class Box {
    double width;
    double height;
    double depth;

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return  width * height * depth;
    }

    void display() {
        System.out.println("Vol of the box is = " + volume());
    }
}

class Boxdemo2 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //Assign values to mybox1's instance variables
        mybox1.setDim(10.0,20.0,10.0);

        //Assign Different values to mybox's instance variable
        mybox2.setDim(3,6,9);

        //Compute volume for First Box
        mybox1.display();

        //Compute volume for Second Box
        mybox2.display();
    }
}