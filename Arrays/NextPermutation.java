package Arrays;

import java.util.Scanner;

//Basic approach generate all Permutations in sorted order then find the required permutation
//time complexity O(n!*n)
//Here is optimal approach.
public class NextPermutation {
    public static void nextPermutation(int arr[], int n) {
        int idx = -1;
        // step1: Find the index that which is first lesser order value from last
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                idx = i;
            }
        }
        // step2: if not found
        if (idx == -1) {
            // reverse the array
            reverseArray(arr, 0, n - 1);
            printArray(arr);
            return;
        }
        // step3: if found then find which element is just greater than present element.
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > arr[idx]) {
                swapArrayElements(arr, idx, i);
            }
        }
        // reverse the index+1 to last element of the sub array.
        reverseArray(arr, idx + 1, n - 1);
        printArray(arr);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void swapArrayElements(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        System.out.println("Enter any " + n + " Elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        nextPermutation(arr, n);
        sc.close();
    }

}
