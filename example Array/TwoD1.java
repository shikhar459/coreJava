//2D array where number of columns is given separately

import java.util.Scanner;

public class TwoD1 {
    public static void main(String[] args) {
        int[][] twod = new int[3][];
        Scanner sc = new Scanner(System.in);
        twod[0] = new int[4];
        twod[1] = new int[4];
        twod[2] = new int[4];

        System.out.println("Enter elements in array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                twod[i][j] = sc.nextInt();
            }
        }
        System.out.println("You have entered the following array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(twod[i][j] + " ");
            }
            System.out.println();
        }
    }
}

