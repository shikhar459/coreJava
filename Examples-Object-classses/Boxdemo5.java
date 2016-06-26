// This progrmas declears two Box objects

class Box {
    double width;
    double height;
    double depth;

    // Sets dimension of box
    void setdim() {
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
        System.out.println(width * height * depth);
    }
}

class Boxdemo5 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();


        //Assign values to mybox1's instance variables
        mybox1.setdim();
        mybox1.volume();

        System.out.println();

        //Assign Different values to mybox's instance variable
        mybox2.setdim();
        mybox2.volume();
    }
}