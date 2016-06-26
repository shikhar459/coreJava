import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        int twod[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 2D array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                twod[i][j] = sc.nextInt();
            }
        }
        System.out.println("You have entered the following 2D array");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(twod[i][j] + " ");
            }
            System.out.println();
        }
    }
}
