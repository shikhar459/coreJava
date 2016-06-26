//Average of numbers

import java.util.Scanner;

class ArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
            sum = sum + num[i];
        }
        System.out.println("Average is: " + (sum / 5));
    }
}
