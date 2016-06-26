// implicit initialization of 2D array

public class TwoDInit {
    public static void main(String[] args) {
        int twod[][] = {{1}, {1, 2}, {1, 2, 3}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(twod[i][j]);
            }
            System.out.println();
        }

    }
}
