package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class CountInversion {
    // condition is i<j and arr[i]>arr[j]
    // time complexity is O(n2)
    // space complexity is O(1)
    private static void countInversition1(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        System.out.println("Number of pairs: " + count);
    }

    // Using Merge sort Method count pairs
    // time complexity O(nlogn)
    // space complexity O(n)
    private static void countInversition2(int[] arr, int n) {
        int low = 0;
        int high = n - 1;
        int count = mergeSort(arr, low, high);
        System.out.println(count);
    }

    private static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low >= high)
            return count;
        int mid = (low + high) / 2;
        count += mergeSort(arr, 0, mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr, low, mid, high);
        return count;

    }

    private static int merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> li = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        int count = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                li.add(arr[left]);
                left++;
            } else {
                li.add(arr[right]);
                right++;
                count += mid - left + 1;// calculating count of inversitions
            }
        }
        while (left <= mid) {
            li.add(arr[left]);
            left++;
        }
        while (right <= high) {
            li.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = li.get(i - low);
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
        countInversition1(arr, n);
        countInversition2(arr, n);
    }

}
