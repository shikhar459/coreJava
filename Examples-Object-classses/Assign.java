class Box {
    int length, breadth, height;
}

class Assign {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = b1;
        int volume = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, breadth and height of box : ");
        b1.length = sc.nextInt();
        b1.breadth = sc.nextInt();
        b1.height = sc.nextInt();

        System.out.println("Length of box 1 is : " + b1.length);
        System.out.println("Breadth of box 1 is : " + b1.breadth);
        System.out.println("Height of box 1 is : " + b1.height);

        volume = b1.length * b1.breadth * b1.height;
        System.out.println("Volume of Box1 is : " + volume);

        b2.length = 10;
        b2.breadth = 10;
        b2.height = 10;

        System.out.println("Length of box 2 is : " + b2.length);
        System.out.println("Breadth of box 2 is : " + b2.breadth);
        System.out.println("Height of box 2 is : " + b2.height);

        volume = b2.length * b2.breadth * b2.height;
        System.out.println("Volume of box 2 is :" + volume);

        System.out.println("Length of box 1 is : " + b1.length);
        System.out.println("Breadth of box 1 is : " + b1.breadth);
        System.out.println("Height of box 1 is : " + b1.height);
    }
}
