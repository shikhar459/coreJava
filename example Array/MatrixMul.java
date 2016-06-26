// matrix multiplication
import java.util.*;
public class MatrixMul {
    public static void main(String[] args) {
        int a[][], b[][], c[][];
        int m, n, p, q, sum = 0;
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter dimensions of matrix 1");
        m = sc.nextInt();
        n = sc.nextInt();

        System.out.println("Enter dimensions of matrix 2");
        p = sc.nextInt();
        q = sc.nextInt();

        //Checking compatibility of two matrix
        if (n != p) {
            System.out.println("...Multiplication not possible...");
            System.exit(0);
        } else {
            System.out.println("...Multiplication possible...");
        }

        //Entering matrix 1

        a = new int[m][n];
        System.out.println("Enter matrix1: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1 is: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        //Entering matrix 2


        b = new int[p][q];
        System.out.println("Enter matrix2: ");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 2 is: ");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }


        c = new int[m][q];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < p; k++) {
                    sum = sum + a[i][k] * b[k][j];
                }
                c[i][j] = sum;
                sum = 0;
            }
        }

        System.out.println("Result of Matrix multiplication: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
