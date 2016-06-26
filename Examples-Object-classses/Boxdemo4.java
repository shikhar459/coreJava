// This progrmas declears two Box objects

class Box {
    double width;
    double height;
    double depth;

    // Sets dimension of box
    void setdim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Display volume of a box
    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }
}

class Boxdemo4 {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double w, h, vol;
        String d;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter width : ");
        w = sc.nextInt();
        System.out.println("Enter height : ");
        h = sc.nextInt();
        System.out.println("Enter depth : ");
        d = sc.next();

        //Assign values to mybox1's instance variables
        mybox1.setdim(w, d, h);
        mybox1.volume();

        System.out.println("Enter width : ");
        w = sc.nextInt();
        System.out.println("Enter height : ");
        h = sc.nextInt();
        System.out.println("Enter depth : ");
        d = sc.next();

        //Assign Different values to mybox's instance variable
        mybox2.setdim(w, d, h);
        mybox2.volume();
    }
}