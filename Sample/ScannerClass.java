//use of scanner class

import java.util.*;

public class ScannerClass {
    public static void main(String[] args) {
        int a, b, sum = 0;
        char ch;
        String str;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        //sum=a+b;
        //System.out.println("Sum is: "+sum);

        System.out.println("Enter a character");
        ch = sc.next().charAt(0);
        System.out.println("Character is: " + ch);
        if (ch == '+') {
            sum = a + b;
        }
        System.out.println("Sum is: " + sum);

        System.out.println("Enter a string");
        sc.nextLine();
        str = sc.nextLine();
        System.out.println("String is: " + str);

    }
}