import java.util.*;

public class array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns:");
        int row = sc.nextInt();  // Example: 3
        int col = sc.nextInt();  // Example: 3

        int[][] M1 = new int[row][col];
        int[][] M2 = new int[row][col];
        int[][] M3 = new int[row][col];  // To store the result of addition

        System.out.println("Enter the elements of 1st matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                M1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of 2nd matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                M2[i][j] = sc.nextInt();
            }
        }

        // Adding the two matrices
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                M3[i][j] = M1[i][j] + M2[i][j];
            }
        }

        System.out.println("Resultant matrix after addition:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(M3[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
