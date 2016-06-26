import java.util.Scanner;

class Greatestnum {
    public static void main(String args[]) {
        //defining Varibale
        int num1, num2, num3;

        //Creating scanner class object to read value from console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 = ");
        num1 = sc.nextInt();
        System.out.println("Enter num2 = ");
        num2 = sc.nextInt();
        System.out.println("Enter num3 = ");
        num3 = sc.nextInt();

        //if-else to check greatest Number
        if (num1 > num2 && num1 > num3) {
            System.out.println("Num1 is Greatest that is " + num1);
        } else if (num2 > num3) {
            System.out.println("Num2 is Greatest that is " + num2);
        } else {
            System.out.println("Num3 is Greatest that is " + num3);
        }
    }
}