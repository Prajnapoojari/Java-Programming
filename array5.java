import java.util.*;

public class array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns for the first matrix:");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();

        System.out.println("Enter the number of rows and columns for the second matrix:");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();



        int[][] M1 = new int[row1][col1];
        int[][] M2 = new int[row2][col2];
        int[][] M3 = new int[row1][col2];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                M1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                M2[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    M3[i][j] += M1[i][k] * M2[k][j];
                }
            }
        }


        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(M3[i][j] + " ");
            }
            System.out.println();
        }


    }
}
