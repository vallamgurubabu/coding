package Arrays;

import java.util.Scanner;

public class MatrixMarkZero3 {
    /*
     * Better approach
     * time complexity : O(2*(m*n))
     * space complexity : O(1)
     * this approach will take marked array inside input array it helps to reduce
     * storage for new array.
     * first row for all columns
     * and first column for all rows
     */
    public static void markMatrixZero(int arr[][], int m, int n) {
        int col0 = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    // row mark with first column
                    arr[i][0] = 0;
                    // column mark with first row
                    if (j != 0) {
                        arr[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }
        // checking for other than first row and column to mark zero
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] != 0) {
                    if (arr[i][0] == 0 || arr[0][j] == 0) {
                        arr[i][j] = 0;
                    }
                }
            }
        }
        // checking for first column to mark zero
        if (arr[0][0] == 0) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
            }
        }
        // checking for first row to mark zero
        if (col0 == 0) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
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
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}