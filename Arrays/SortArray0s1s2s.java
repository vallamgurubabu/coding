package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//you can simply sort the array but it gives max time complexity o(n2) and minimum time complexity o(nlogn)
//we can do this o(2n) using count0 count1 count2 variables. 
//but we can do it in o(n) time. 
public class SortArray0s1s2s {

    // time complexity o(nlog(n))
    public static void sortArray(int arr[]) {
        Arrays.sort(arr);
    }

    // Dutch National Flag Algorithm
    // time complexity o(n)
    public static void sortArray(int arr[], int n) {
        int left = 0;
        int mid = 0;
        int right = n - 1;
        while (mid <= right) {
            if (arr[mid] == 0) {
                swap(arr, mid, left);
                left++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, right);
                right--;
            }
        }

    }

    public static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void print(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements:(only 0 or 1 or 2) ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortArray(arr);
        print(arr);
        sortArray(arr, n);
        print(arr);
        sc.close();
    }
}
