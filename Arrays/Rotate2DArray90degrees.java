package Arrays;

import java.util.Scanner;

public class Rotate2DArray90degrees {
    private static void rotate90Degree(int[][] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <m; j++) {
                swap(arr, i, j, j, i);
            }
        }
        System.out.println("=================");
        for (int i = 0; i < n; i++) {
            int temp[] = arr[i];
            reverse(temp, m);
            arr[i] = temp;
        }
    }

    private static void reverse(int arr[], int n) {
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    private static void print(int arr[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void swap(int arr[][], int index1, int index2, int index3, int index4) {
        int temp = arr[index1][index2];
        arr[index1][index2] = arr[index3][index4];
        arr[index3][index4] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n,m values for 2D Array: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        rotate90Degree(arr, n, m);
        print(arr, n, m);
        sc.close();
    }

}
