package Arrays;

import java.util.Scanner;

public class MatrixMarkZero1 {
    //Normal approach
    // time complexity : O(m*n)*(m+n)
    // space complexity : O(1)
    public static void markMatrixZero(int arr[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    // total col = row size
                    markRow_1(arr, n, i);
                    // total row = col size
                    markCol_1(arr, m, j);
                }
            }
        }
    }

    private static void markRow_1(int[][] arr, int n, int i) {
        for (int k = 0; k < n; k++) {
            arr[i][k] = -1;
        }
    }

    private static void markCol_1(int[][] arr, int m, int j) {
        for (int k = 0; k < m; k++) {
            arr[k][j] = -1;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size: ");
        int m = sc.nextInt();
        System.out.println("Enter column size: ");
        int n = sc.nextInt();
        System.out.println("Enter an array Elements of " + m + " x " + n + " size array");
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your array is: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        markMatrixZero(arr, m, n);
        System.out.println("Your array Marked with 0: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == -1)
                    arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}