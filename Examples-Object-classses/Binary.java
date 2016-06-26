//Binary search

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        int a[], n, first, last, middle, search;
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        System.out.println("Input " + n + " numbers in Sorted order :");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        first = 0;
        last = n - 1;
        middle = (first + last) / 2;

        System.out.println("Enter number to be searched");
        search = sc.nextInt();
        while (first <= last) {
            if (a[middle] < search) {
                first = middle + 1;
            } else if (a[middle] == search) {
                System.out.println("Number found at position : " + (middle + 1));
                break;
            } else {
                last = middle - 1;
            }

            middle = (first + last) / 2;
        }
        if (first > last)
            System.out.println("Not found!! Number " + search + " is not present in the list");
    }
}