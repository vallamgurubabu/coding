package Arrays;

import java.util.Scanner;

public class MatrixMarkZero2 {
    // Better approach
    // time complexity : O(2*(m*n))
    // space complexity : O(row+col)
    public static void markMatrixZero(int arr[][], int row[], int col[], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    arr[i][j] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size: ");
        int m = sc.nextInt();
        System.out.println("Enter column size: ");
        int n = sc.nextInt();
        int row[] = new int[m];
        int col[] = new int[n];
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
        markMatrixZero(arr, row, col, m, n);
        System.out.println("Your array Marked with 0: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}