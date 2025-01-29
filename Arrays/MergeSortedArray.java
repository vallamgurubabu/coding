package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    // time complexity O(min(m,n)+nlog(m),nlog(n))
    private static void MergeSortedArrays(int[] arr1, int n, int[] arr2, int m) {
        int left = n - 1;
        int right = 0;
        while (left >= 0 && right < m) {
            if (arr1[left] > arr2[right]) {
                int temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of firt array: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " Elements in sorted order in first array: ");
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter size of second array: ");
        int m = sc.nextInt();
        System.out.println("Enter " + m + " Elements in sorted order in second array: ");
        int arr2[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();
        MergeSortedArrays(arr1, n, arr2, m);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("\nArray1==================");
        print(arr1);
        System.out.println("\nArray2=================");
        print(arr2);
    }

    private static void print(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
