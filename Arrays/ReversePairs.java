package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversePairs {

    // Brute Force Approach
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    private static void countInversionsBruteForce(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > 2L * arr[j]) { // Use long to avoid integer overflow
                    count++;
                }
            }
        }
        System.out.println("Number of pairs (Brute Force): " + count);
    }

    // Merge Sort Approach
    // Time Complexity: O(n log n)
    // Space Complexity: O(n)
    private static void countInversionsMergeSort(int[] arr, int n) {
        int count = mergeSort(arr, 0, n - 1);
        System.out.println("Number of pairs (Merge Sort): " + count);
    }

    private static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low < high) {
            int mid = (low + high) / 2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid + 1, high);
            count += merge(arr, low, mid, high);
        }
        return count;
    }

    private static int merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        int count = 0;

        // Count the number of reverse pairs
        int i = low, j = mid + 1;
        while (i <= mid && j <= high) {
            if (arr[i] > 2L * arr[j]) { // Use long to avoid integer overflow
                count += mid - i + 1;
                j++;
            } else {
                i++;
            }
        }

        // Merge the two sorted halves
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // Add remaining elements from the left half
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // Add remaining elements from the right half
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // Copy the sorted elements back to the original array
        for (int k = low; k <= high; k++) {
            arr[k] = temp.get(k - low);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of an array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        countInversionsBruteForce(arr, n);
        countInversionsMergeSort(arr, n);
    }
}