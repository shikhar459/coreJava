//2D array with variable number of columns

public class TwoD2 {
    public static void main(String[] args) {
        int twod[][] = new int[3][];
        Scanner sc = new Scanner(System.in);
        twod[0] = new int[2];
        twod[1] = new int[3];
        twod[2] = new int[4];
        //twod[3] = new int[4];

        System.out.println("Enter elements in array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i + 2; j++) {
                twod[i][j] = sc.nextInt();
            }
        }
        System.out.println("You have entered the following array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i + 2; j++) {
                System.out.print(twod[i][j] + " ");
            }
            System.out.println();
        }
    }
}
