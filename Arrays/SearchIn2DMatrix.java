package Arrays;

import java.util.Scanner;

public class SearchIn2DMatrix {
    // if we have un sorted matrix

    // By traversing 2D Matrix we can achive this
    // time complexity is O(m X n) and space complexity is O(1)
    private static boolean binarySearch1(int[][] arr, int row, int col, int target) {
        if (row == 0)
            return false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == target)
                    return true;
            }
        }
        return false;
    }

    // But what what if we have Sorted 2D Matrix
    // Optimal Binary Search approach
    // time complexity = O(log(m X n)).
    // space complexity O(1).
    public static boolean binarySearch2(int arr[][], int row, int col, int target) {
        if (row == 0)
            return false;
        int low = 0;
        int high = (row * col - 1);
        while (low <= high) {
            int mid = (low + (high - low) / 2);
            // row = 3 col = 4 low = 0 high = 11
            // mid = 5
            // mid/4 = 1
            // mid%4 = 1
            // arr[1][1] is mid of 2D array of 3X4
            // 1 2 3 4
            // 5 6 7 8
            // 9 10 11 12
            // Here 12 elements we have the mid element is 6 which is arr[1][1]
            if (arr[mid / col][mid % col] == target) {//
                return true;
            }
            if (arr[mid / col][mid % col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
    // We can also apply this binary search approach to check each row
    // time complexity = O(nlog(m)).

    private static boolean binarySearch3(int[][] arr, int row, int col, int target) {
        for (int i = 0; i < row; i++) {
            int[] temp = arr[i];
            boolean ans = binarySearch(temp, col, target);
            if (ans == true)
                return ans;
        }
        return false;
    }

    // helper method.
    public static boolean binarySearch(int arr[], int col, int target) {
        if (col == 0)
            return false;
        int low = 0;
        int high = col - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return true;
            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and col size: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("Enter " + row + "X" + col + " array elements: ");
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Target Element: ");
        int target = sc.nextInt();
        sc.close();
        boolean ans1 = binarySearch1(arr, row, col, target);
        boolean ans2 = binarySearch2(arr, row, col, target);
        boolean ans3 = binarySearch3(arr, row, col, target);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans1);
    }
}
